package fepi.revisao.br;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Carro{
  String marca;
  String modelo;
  int ano;
  double preco;


  //construtor
  public Carro(){

  }
  //construtor com 4 parametros 
  public Carro(String marca, String modelo, int ano , double preco){
    this.marca = marca;
    this.modelo =modelo;
    this.ano = ano;
    this.preco = preco;
  }
  //metodo getter
  public String getMarca(){
     return marca;
  }
  public String getModelo(){
    return modelo;
 }
 public int getAno(){
    return ano;
 }
 public double getPreco(){
    return preco;
 }
 //metodo setter 
 public void setMarca(String marca){
    this.marca =marca;
 }
 public void setModelo(String modelo){
    this.modelo =modelo;
 }
 public void setAno(int ano){
    this.ano =ano;
 }
 public void setPreco(double preco){
    this.preco =preco;
 }
 // metodo de desconto
 public void aplicarDesconto(double percentual){
    // logica do desconto
  double desconto = preco *(percentual/100);
  preco= preco - desconto;
 }
 
// metodo para mostrar as informacoes 
public void mostrarInformacoes()
{
   DecimalFormat df = new DecimalFormat("#.00");
 System.out.println("marca: "+ marca);
 System.out.println("modelo do carro: "+ modelo);
 System.out.println("ano de lançamento: "+ ano);
 System.out.println ("preço: R$ "+ df.format(preco) );

}
}
