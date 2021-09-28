package thalita;

public class Guarda extends Pessoa implements Patrulha {
    private int coragem;

    public Guarda(String nome, int idade, int honra, int coragem){
        super(nome,idade,honra);
        this.coragem = coragem;
    }

    @Override
    public void orar() {
        System.out.println("O " + this.getNome() + " fez uma oração aos deuses antigos");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Coragem: " + getCoragem());
    }

    @Override
    public void fazerPatrulha() {
        System.out.println("O " + this.getNome()+ " fez uma patrulha além da muralha");
        System.out.println("A coragem do " + this.getNome() + " aumentou 20 unidades");
        setCoragem(coragem + 20);
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }
}
