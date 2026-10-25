package LinguApp;

public class Idioma {
    private String nome;
    private int qntAtividades;
    private int xp;
    private int unidades;

    public Idioma(String nome, int qntAtividades) {
        this.nome = nome;
        this.qntAtividades = qntAtividades;
        this.xp = qntAtividades * 25;
        this.unidades = 30;
    }

    @Override
    public String toString() {
        return "Idioma: " + nome + " | Quantidade de atividades: " + qntAtividades + " | Quantidade de xp: " + xp;

    }

    public String getNome() {
        return nome;
    }

    public void fazerAtividade() {
        qntAtividades -= 1;
    }
    public int getQntAtividades() {
        return qntAtividades;
    }

    public void completaUnidade() {
        unidades -= 1;
    }
}
