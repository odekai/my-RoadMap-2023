public class Caminhao extends VeiculoBase  {

    public int eixos;
    private int numeroDePortas;

    //acessando atributo externo
    


    //
    public Caminhao(String marca,String modelo,int ano,int numeroDePortas,int eixos){
        super(marca,modelo,ano);
        this.eixos = eixos;
        this.numeroDePortas = numeroDePortas;
       
    }
    //metodos
    @Override
    public void acelerar(){
      
       System.out.println("hummm chizzzz");


    }
    public void frear(){
       
        System.out.println("freando caminhão");
       

    }
    public void exibirinfo(){
        super.exibirinfo();
        System.out.println("Número de eixos: "+eixos+"\nNúmero de portas: "+ numeroDePortas);
        
    }
}