package LinguApp;

public class mainLinguaApp {
    public void main(String[] args) {
        LinguApp lapp = new LinguApp();
        cadastroIdiomas(lapp);
        cadastroUsuarios(lapp);
        System.out.println(lapp.mostrarIdiomas());
        System.out.println(lapp.detalharUsuario(1));
        escolhaDosCursos(lapp);
        System.out.println("--------");
        System.out.println(lapp.detalharUsuario(1));
        System.out.println("--------");
        realizaAtividadesAmelie(lapp);
        System.out.println(lapp.mostraProgressoDoUsuario(1,0));


        }
    private static void cadastroIdiomas(LinguApp lapp) {
        lapp.cadastrarIdioma("Inglês", 2000);
        lapp.cadastrarIdioma("Italiano", 1500);
        lapp.cadastrarIdioma("Japonês", 2300);
    }
    private static void cadastroUsuarios(LinguApp lapp) {
        lapp.cadastrarUsuario("João Henrique", "jhenrique@gmail.com", "JHzin01", "Português");
        lapp.cadastrarUsuario("Amelie Poulain", "aameliepoulainn@gmail.com", "AmeliePoulain", "Francês");
    }

    private static void escolhaDosCursos(LinguApp lapp) {
        lapp.adicionaCursoUsuario(1,0);
    }
    private static void realizaAtividadesAmelie(LinguApp lapp) {
        for (int i = 0; i < 2010; i++) {
            lapp.realizaAtividadeDoUsuario(1, 0);
        }
    }


}
