package fepi.revisao.br;
import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.setAno(2011);
        carro1.setMarca("chevrolet");
        carro1.setModelo("astra");
        carro1.setPreco(320000);

        carro1.aplicarDesconto(20);
        carro1.mostrarInformacoes();
        
        //criando um novo carro
        Carro carro2 = new Carro("Toyota", "Corolla", 2024, 85000.50);
        //mostrando informacoes antes do desconto
        System.out.println("preço sem desconto: ");
        carro2.mostrarInformacoes();
        //aplicando desconto
        carro2.aplicarDesconto(10);
        //mostrando valor com desconto
        carro2.mostrarInformacoes();

    }
   
     
    

}
