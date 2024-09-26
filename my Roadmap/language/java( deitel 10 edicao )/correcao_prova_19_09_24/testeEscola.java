public class testeEscola  {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(0021,"vitor",18,70,false);
        Aluno aluno1 = new Aluno(0032,"igor",29,40,false);
        
        aluno.matricular();
        aluno1.matricular();
         
       
    
     disciplina matematica1 = new disciplina(01,"matematica",360);
    matematica1.matricularAluno(aluno.getNome());
    matematica1.matricularAluno(aluno1.getNome());
    matematica1.getAlunosMatriculados();
    
}
}
