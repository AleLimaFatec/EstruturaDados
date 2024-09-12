public class Aluno {
    public int matricula;
    public String nome;
    public double nota;

    public Aluno(int mat, 
                String nome, 
                double nota)
    {
        this.matricula = mat;
        this.nome = nome;
        this.nota = nota;        

    }

    @Override
    public String toString() {
        return "ALUNO:\n"+
                "MATR. "+this.matricula+"\n"+
                "NOME. "+this.nome+"\n"+
                "NOTA. "+this.nota;
    }

}
