package thalita;

public class Cavaleiro extends Pessoa implements Patrulha, Consagra {
    // Cavaleiro possui 0 ou 1 montaria

    private String casa;
    private String nomeEscudeiro;

    public Montaria montaria;

    public Cavaleiro(String nome, int idade, int honra, String casa, String nomeEscudeiro) {
        super(nome, idade, honra);
        this.casa = casa;
        this.nomeEscudeiro = nomeEscudeiro;
    }

    @Override
    public void orar() {
        System.out.println("O " + this.getNome() + " fez uma oração ao deus do fogo");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Casa: " + this.getCasa());
        System.out.println("Escudeiro: " + this.getNomeEscudeiro());

        if(montaria!=null)
            System.out.println("Montaria: " + this.montaria.getNome());
        else
            System.out.println("Montaria: não possui montaria");
    }

    @Override
    public void fazerPatrulha() {
        System.out.println("O " + this.getNome() + " fez uma patrulha pelo reino");
    }

    @Override
    public void consagrarCavaleiro() {
        System.out.println("O " + this.getNome() + " consagrou um novo cavaleiro");
        System.out.println("A honra do " + this.getNome() + " aumentou 5 unidades");
        int honraAnterior = getHonra();
        honraAnterior += 5;
        setHonra(honraAnterior);
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getNomeEscudeiro() {
        return nomeEscudeiro;
    }

    public void setNomeEscudeiro(String nomeEscudeiro) {
        this.nomeEscudeiro = nomeEscudeiro;
    }

    public void setMontaria(Montaria montaria) {
        this.montaria = montaria;
    }
}
