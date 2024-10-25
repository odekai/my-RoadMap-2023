public class VeiculoBase {

    public String marca;
    public String modelo;
    public int ano;
    //construtor
    public VeiculoBase(String marca, String modelo,int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    //metodos
    public void acelerar(){
        System.out.println("\nvrum vrum ");

    }
    public void frear(){
        System.out.println("freando");

    }
    public void exibirinfo(){
        System.out.println("\nMarca: "+marca+"\nModelo: "+modelo+"\nAno: "+ano);
    }
}