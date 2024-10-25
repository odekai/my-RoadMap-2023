public class Moto extends VeiculoBase {

    public int cilindradas;

    //contrutor
    public Moto(String marca,String modelo,int ano,int cilindradas){
        super(marca,modelo,ano);
        this.cilindradas= cilindradas;
    }
    // metodos
    @Override
    public void acelerar(){
      
       System.out.println("randandan");


    }
    public void frear(){
        
        System.out.println("xiiiiiiiiiiii");
       

    }
    public void exibirinfo(){
        super.exibirinfo();
        System.out.println("potencia do motor: "+cilindradas+"cc");
        
    }

}