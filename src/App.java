public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Aluno aluno = new Aluno(1,"Ale",7.5);
        Aluno aluno2 = new Aluno(2,"Maria",9.0);

        Aluno aluno3 = new Aluno(1,"Natália",6);
        Aluno aluno4 = new Aluno(2,"João",10);

        //System.out.println(aluno);
        //System.out.println(aluno2);

        Aluno[] estudantes = {aluno,aluno2};
        Aluno[] alunos = {aluno3,aluno4};
        Turma turma = new Turma("ADS", 
                                estudantes);
        Turma classe = new Turma("S.I"
                                ,alunos);      

        turma.exibirAlunos();
        classe.exibirAlunos();
        Turma[] turmas = {turma,classe};
        Escola unimes = new Escola("Unimes", turmas);

        unimes.exibirAlunosPorTurma();
    }
}
