public class Carro extends VeiculoBase{
    public int numeroDePortas;
    
    //construtor
    public Carro(String marca,String modelo,int ano,int numeroDePortas){
        super(marca,modelo,ano);
        this.numeroDePortas =numeroDePortas;
    }

    //metodos
    @Override
    public void acelerar(){
       
       System.out.println("\nferrrariiiiiiiii");


    }
    public void frear(){
        
        System.out.println("freando carro");
       

    }
    public void exibirinfo(){
        super.exibirinfo();
        System.out.println("Número de portas: "+numeroDePortas);
        
    }


}
