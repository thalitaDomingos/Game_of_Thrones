package thalita;

public abstract class Pessoa {
    // Pessoa possui 0 ou 1 arma

    public static int quantidadePessoa;
    private String nome;
    private int idade;
    private int honra;

    public Arma arma;

    public Pessoa(String nome, int idade, int honra) {
        this.nome = nome;
        this.idade = idade;
        this.honra = honra;
        quantidadePessoa++;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Honra: " + this.getHonra());

        if(arma != null)
            System.out.println("Arma: " + this.arma.getTipo());
        else
            System.out.println("Arma: não possui arma");
    }

    public abstract void orar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getHonra() {
        return honra;
    }

    public void setHonra(int honra) {
        this.honra = honra;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
