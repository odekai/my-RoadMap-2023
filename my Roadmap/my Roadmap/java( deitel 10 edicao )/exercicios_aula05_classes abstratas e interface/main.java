import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
         
        //armazenando numa Arry list
        ArrayList<VeiculoBase> listaDeVeiculos = new ArrayList<>();

    

        Carro carro1 = new Carro("fiat", "uno", 2010, 2);
    
        Moto moto1 = new Moto("kawasaki", "ninja", 2012, 300);

        Caminhao caminhao1 = new Caminhao("volvo", "não sei ", 2017,2,6);

        //armazenando as isntancias 
        
        listaDeVeiculos.add(caminhao1);
        listaDeVeiculos.add(carro1);
        listaDeVeiculos.add(moto1);       
        // loop para chamar metodos 
        for(VeiculoBase veiculo: listaDeVeiculos){
            veiculo.acelerar();
            veiculo.frear();
            veiculo.exibirinfo();
            
        }
        


    }
    
}
