import  java.time.LocalDate;
import java.util.ArrayList;
public class disciplina {
    private int codigo;
    private String nome;
    private int CargaHoraria;
    private ArrayList<String> AlunosMatriculados;

    //constrututores
  
    public disciplina(int codigo, String nome,int cargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.CargaHoraria = cargaHoraria;
        this.AlunosMatriculados = new ArrayList<String>();

    }
    //getter
    public int getCodigo(){
        return codigo;

    }
    public String getNome(){
        return nome;
    }
    public int getCargaH(){
        return CargaHoraria;
    }
    public void getAlunosMatriculados(){
         System.out.println(AlunosMatriculados);
    }
    //metodo setter
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNome( String nome){
        this.nome = nome;
    }
    public void setCargaH(int h){
        CargaHoraria = h;
    }
public void setAlunos(ArrayList<String> AlunosMatriculados){
    this.AlunosMatriculados = AlunosMatriculados;
}
//metodo para matricular na disciplina
public void matricularAluno(String aluno ){
    this.AlunosMatriculados.add(aluno);
    System.out.println("aluno adicionado na disciplina");
     
    
}


    

}

