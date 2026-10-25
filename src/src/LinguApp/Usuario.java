package LinguApp;

public class Usuario {
    private String nome;
    private String email;
    private String username;
    private String idiomaNativo;
    private int xpTotal;
    private Progresso[] cursos;
    private int iCurso;
    private int ofensiva;

    public Usuario(String nome, String email, String username, String idiomaNativo) {
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.idiomaNativo = idiomaNativo;
        xpTotal = 0;
        this.cursos = new Progresso[3];
        ofensiva = 0;
    }
    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
    }

    public void adicionaCurso(Idioma novoCurso) {
        cursos[iCurso] = new Progresso(novoCurso);
        iCurso ++;
    }

    @Override
    public String toString() {
        return "Usuário: " + username + " - " + nome + "\nEmail: " + email + "\nTotal de xp: " + xpTotal + "\n\uD83D\uDD25 Dias de ofensiva: "+ ofensiva + "\n" + listaCursos();
    }
    public String listaCursos() {
        String out = "";
        if (iCurso == 0) {
            out += "O usuário não iniciou nenhum curso!";
        } else {
            out += "--> Cursos do usuário: ";
            for (int i = 0; i < cursos.length; i++) {
                if (!(cursos[i] == null)) {
                    out += "\n" + cursos[i].toString();
                }
            }
        }
        return out;
    }
    public String mostraProgressoDoCurso(int posicaoCurso) {
        return "Usuário: " + username + "\nProgresso do curso de " + cursos[posicaoCurso].toString() + " = " + cursos[posicaoCurso].progressoDoCurso() + "%";
    }

    public void realizaAtividade(int posicaoCurso) {
        cursos[posicaoCurso].fazerAtividade();
    }
    public void incrementaOfensiva(int ofensiva) {
        ofensiva ++;
    }
}
