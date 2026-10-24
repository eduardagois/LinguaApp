package LinguApp;

public class LinguApp {
    private Usuario[] usuarios;
    private Idioma[] idiomas;
    private int iUsuario;
    private int iIdioma;

    public LinguApp() {
        this.usuarios = new Usuario[200];
        this.idiomas = new Idioma[10];
        iUsuario = 0;
        iIdioma = 0;
    }
    public void cadastrarUsuario(String nome, String email, String username, String idiomaNativo) {
        usuarios[iUsuario] = new Usuario(nome, email, username, idiomaNativo);
        iUsuario ++;
    }
    public void cadastrarIdioma(String nome, int qntAtividades) {
        idiomas[iIdioma] = new Idioma(nome, qntAtividades);
        iIdioma ++;
    }

    public String mostrarIdiomas() {
        String out = "IDIOMAS CADASTRADOS: \n";
        for (int i = 0; i < iIdioma; i++) {
            out += i+1 + ". " + idiomas[i].toString() + "\n";
        }
        return out;
    }
    public boolean adicionaCursoUsuario(int posicaoUsuario, int posicaoIdioma) {
        usuarios[posicaoUsuario].adicionaCurso(idiomas[posicaoIdioma]);
        return true;
    }
    public String detalharUsuario(int posicao) {
        return usuarios[posicao].toString();
    }
}
