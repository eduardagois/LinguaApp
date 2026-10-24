package LinguApp;

public class Idioma {
    private String nome;
    private int qntAtividades;
    private int xp;

    public Idioma(String nome, int qntAtividades) {
        this.nome = nome;
        this.qntAtividades = qntAtividades;
        this.xp = qntAtividades * 25;
    }

    @Override
    public String toString() {
        return "Idioma: " + nome + " | Quantidade de atividades: " + qntAtividades + " | Quantidade de xp: " + xp;

    }

    public String getNome() {
        return nome;
    }
}
