document.addEventListener('DOMContentLoaded', (event)=>{
    function alternarPokedex(){
        const closedPokedex = document.getElementById('closedPokedex');
        const openPokedex = document.getElementById('openPokedex');

        closedPokedex.addEventListener('click',()=>{
            closedPokedex.style.display =' none';
            openPokedex.style.display = 'block';
        });
        openPokedex.addEventListener('click',()=>{
            openPokedex.style.display = 'none';
            closedPokedex.style.display = 'block';
        });
    }
    alternarPokedex();
})
