package exercicios.online;
public class Produto {
    //atributos
    int codigo;
    String nome;
    double preco;

    //cosntrutor 
    public Produto(){}
    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    //metodo
    public double calcularDesconto(double desconto){
        return(1 - desconto /100) * preco;
    }
    
}


    


 
