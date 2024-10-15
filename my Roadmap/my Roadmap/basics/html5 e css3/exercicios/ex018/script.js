document.addEventListener("DOMContentLoaded", function () {
    const retratos = document.querySelectorAll(".retrato");

    retratos.forEach(retrato => {
        retrato.addEventListener("mousedown", handleMouseDown);
        retrato.addEventListener("touchstart", handleTouchStart);
    });

    function handleMouseDown(event) {
        event.preventDefault();
        const retrato = event.target;

        const initialX = event.clientX - retrato.getBoundingClientRect().left;
        const initialY = event.clientY - retrato.getBoundingClientRect().top;

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

        const initialX = event.touches[0].clientX - retrato.getBoundingClientRect().left;
        const initialY = event.touches[0].clientY - retrato.getBoundingClientRect().top;

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

        // Reduzindo a sensibilidade pela metade
        const sensitivity = 0.5;
        newX *= sensitivity;
        newY *= sensitivity;

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

    retratos.forEach(retrato => {
        placeImageRandomly(retrato);
    });
});
