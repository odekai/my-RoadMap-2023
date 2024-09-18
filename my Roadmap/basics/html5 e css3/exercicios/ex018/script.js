document.addEventListener("DOMContentLoaded", function () {
    const retratos = document.querySelectorAll(".retrato");

    retratos.forEach(retrato => {
        retrato.addEventListener("mousedown", handleMouseDown);
        retrato.addEventListener("touchstart", handleTouchStart);
        placeImageRandomly(retrato);
        startFloating(retrato);
    });

    function handleMouseDown(event) {
        event.preventDefault();
        const retrato = event.target;

        let initialX = event.clientX - retrato.offsetLeft;
        let initialY = event.clientY - retrato.offsetTop;

        function handleMouseMove(moveEvent) {
            const newX = moveEvent.clientX - initialX;
            const newY = moveEvent.clientY - initialY;

            moveImage(retrato, newX, newY);
        }

        function handleMouseUp() {
            document.removeEventListener("mousemove", handleMouseMove);
            document.removeEventListener("mouseup", handleMouseUp);
        }

        document.addEventListener("mousemove", handleMouseMove);
        document.addEventListener("mouseup", handleMouseUp);
    }

    function handleTouchStart(event) {
        event.preventDefault();
        const retrato = event.target;

        let initialX = event.touches[0].clientX - retrato.offsetLeft;
        let initialY = event.touches[0].clientY - retrato.offsetTop;

        function handleTouchMove(moveEvent) {
            const newX = moveEvent.touches[0].clientX - initialX;
            const newY = moveEvent.touches[0].clientY - initialY;

            moveImage(retrato, newX, newY);
        }

        function handleTouchEnd() {
            document.removeEventListener("touchmove", handleTouchMove);
            document.removeEventListener("touchend", handleTouchEnd);
        }

        document.addEventListener("touchmove", handleTouchMove);
        document.addEventListener("touchend", handleTouchEnd);
    }

    function moveImage(image, newX, newY) {
        const maxX = window.innerWidth - image.clientWidth;
        const maxY = window.innerHeight - image.clientHeight;

        image.style.left = Math.min(Math.max(0, newX), maxX) + "px";
        image.style.top = Math.min(Math.max(0, newY), maxY) + "px";
    }

    function placeImageRandomly(image) {
        const maxAttempts = 10;
        let attempts = 0;

        function getRandomPosition() {
            const randomX = Math.random() * (window.innerWidth - image.clientWidth);
            const randomY = Math.random() * (window.innerHeight - image.clientHeight);
            return { x: randomX, y: randomY };
        }

        function checkOverlap(position) {
            for (const otherImage of retratos) {
                if (otherImage !== image) {
                    const rect1 = image.getBoundingClientRect();
                    const rect2 = otherImage.getBoundingClientRect();

                    if (
                        position.x < rect2.right &&
                        position.x + image.clientWidth > rect2.left &&
                        position.y < rect2.bottom &&
                        position.y + image.clientHeight > rect2.top
                    ) {
                        return true; // Overlaps with another image
                    }
                }
            }
            return false; // Does not overlap
        }

        function setPosition() {
            const position = getRandomPosition();

            if (!checkOverlap(position)) {
                image.style.position = 'absolute';
                image.style.left = `${position.x}px`;
                image.style.top = `${position.y}px`;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    setPosition(); // Retry
                } else {
                    console.warn(`Failed to position image: ${image}`);
                }
            }
        }

        setPosition();
    }

    function startFloating(image) {
        const maxX = window.innerWidth - image.clientWidth;
        const maxY = window.innerHeight - image.clientHeight;

        function getRandomDirection() {
            return (Math.random() > 0.5 ? 1 : -1) * (Math.random() * 0.5);
        }

        let deltaX = getRandomDirection();
        let deltaY = getRandomDirection();

        function float() {
            let currentX = parseFloat(image.style.left) || 0;
            let currentY = parseFloat(image.style.top) || 0;

            if (currentX + deltaX < 0 || currentX + deltaX > maxX) {
                deltaX *= -1;
            }

            if (currentY + deltaY < 0 || currentY + deltaY > maxY) {
                deltaY *= -1;
            }

            image.style.left = Math.min(Math.max(0, currentX + deltaX), maxX) + "px";
            image.style.top = Math.min(Math.max(0, currentY + deltaY), maxY) + "px";

            requestAnimationFrame(float);
        }

        requestAnimationFrame(float);
    }
    const audio = document.getElementById("background-audio");

            audio.addEventListener('ended', function() {
                this.currentTime = 0;
                this.play();
            }, false);

            audio.addEventListener('canplaythrough', function() {
                audio.muted = false;
                audio.play();
            }, false);

            function checkAudio() {
                if (audio.paused) {
                    audio.muted = true;
                    audio.play().then(() => {
                        audio.muted = false;
                    }).catch(error => {
                        console.error('Playback failed:', error);
                    });
                }
            }

            // Verificação contínua para garantir que o áudio esteja tocando
            setInterval(checkAudio, 1000);
            

});
