public class Aluno{
    private int matricula;
    private String nome;
    private int idade;
    private int nota;
    boolean matriculado ;

    //contrutores
  
    public Aluno(int matricula,String nome,int idade,int nota, boolean matriculado){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.matriculado = matriculado;

    }
    //metodo getter
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getNota(){
        return nota;
    }
    public boolean getMatriculado(){
        return matriculado;
    }
    //metodo setter 
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNota(int nota){
        this.nota = nota;
    }
    public void setMatriculado(boolean matriculado){
        this.matriculado = matriculado;
    }
    
    
    
    //metodo para matricular
    public boolean matricular(){
        if(matriculado==false){
            matriculado = true;
            System.out.println("sucesso");
            return true;

        }
        else{
        System.out.println(" aluno já está matriculado");
        return false;
        }
   
    }
     
    public boolean desmatricular(){
        if(matriculado == true){
            this.matriculado = false;
            System.out.println("Desmatriculado com sucesso");
            return true;
        }else{
            System.out.println("O aluno já está desmatriculado");
            return false;
        }
       
    }
}
         
    




       








