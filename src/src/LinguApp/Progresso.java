package LinguApp;

public class Progresso {

    private Idioma curso;
    private static int totalUnidades;
    private static int totalAtividades;

    public Progresso(Idioma curso) {
        this.curso = curso;
        totalUnidades = 30;
        totalAtividades = curso.getQntAtividades();

    }

    public void fazerAtividade() {
        curso.fazerAtividade();
        if (curso.getQntAtividades() % totalUnidades == 0) {
            curso.completaUnidade();
        }
    }

    public double progressoDoCurso() {
        double resultado = ((double) (totalAtividades - curso.getQntAtividades()) / totalAtividades) * 100;
        if (resultado <= 100) {
            return resultado;
        }
        return 100;
    }
        @Override
        public String toString () {
            return curso.getNome();
    }
}
