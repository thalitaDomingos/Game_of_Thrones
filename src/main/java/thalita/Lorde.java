package thalita;

public class Lorde extends Pessoa implements Consagra {
    private String casa;
    private int qtdVassalos;

    public Lorde(String nome, int idade, int honra, String casa, int qtdVassalos) {
        super(nome, idade, honra);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos;
    }

    @Override
    public void orar() {
        System.out.println("O " + this.getNome()+ " fez uma oração aos sete deuses");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Casa: "+ this.getCasa());
        System.out.println("Quantidade de Vassalos: "+ this.getQtdVassalos());
    }

    @Override
    public void consagrarCavaleiro() {
        System.out.println("0 " + this.getNome() + " consagrou um novo cavaleiro");
        System.out.println("A quantidade de Vassalos do " + this.getNome() + " aumentou 1 unidade");
        qtdVassalos++;
    }

    public String getCasa() {
        return casa;
    }

    public int getQtdVassalos() {
        return qtdVassalos;
    }
}
