package LinguApp;

public class Usuario {
    private String nome;
    private String email;
    private String username;
    private String idiomaNativo;
    private int xpTotal;
    private Idioma[] cursos;
    private int iCurso;
    private int ofensiva;

    public Usuario(String nome, String email, String username, String idiomaNativo) {
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.idiomaNativo = idiomaNativo;
        xpTotal = 0;
        this.cursos = new Idioma[3];
        ofensiva = 0;
    }
    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
    }

    public void adicionaCurso(Idioma novoCurso) {
        cursos[iCurso] = novoCurso;
    }

    @Override
    public String toString() {
        return "Usuário: " + username + " - " + nome + "\nEmail: " + email + "\nTotal de xp: " + xpTotal + "\n--> Cursos do usuário: " + listaCursos();
    }
    public String listaCursos() {
        String out = "";
        for (int i = 0; i < cursos.length; i++ ) {
            if (!(cursos[i] == null)) {
                out += "\n" + cursos[i].getNome();
            }
        }
        return out;
    }
}
