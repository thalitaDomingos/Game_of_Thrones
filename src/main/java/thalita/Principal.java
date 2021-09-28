package thalita;

public class Principal {
    public static void main(String[] args) {

        Guarda guarda = new Guarda("Guarda 1", 20, 200, 50);
        Cavaleiro cavaleiro = new Cavaleiro("Cavaleiro 1", 30, 300, "Casa do Cavaleiro", "Escudeiro do Cavaleiro");
        Lorde lorde = new Lorde("Lorde 1", 40, 100, "Casa do Lorde", 25);

        Pessoa[] pessoasArray = new Pessoa[3];

        pessoasArray[0] = guarda;
        pessoasArray[1] = cavaleiro;
        pessoasArray[2] = lorde;

        for (Pessoa pessoa : pessoasArray) {
            System.out.println(" ");

            if (pessoa instanceof Guarda) {
                Guarda g1 = (Guarda) pessoa;
                g1.fazerPatrulha();
                g1.orar();
                g1.mostraInfo();

            } else if (pessoa instanceof Cavaleiro) {
                Cavaleiro c1 = (Cavaleiro) pessoa;
                c1.fazerPatrulha();
                c1.consagrarCavaleiro();
                c1.orar();
                c1.mostraInfo();

            } else if (pessoa instanceof Lorde) {
                Lorde l1 = (Lorde) pessoa;
                l1.consagrarCavaleiro();
                l1.orar();
                l1.mostraInfo();
            }
        }
        System.out.println(" ");
        System.out.println("A quantidade de pessoas criadas é: " + Pessoa.quantidadePessoa);
    }
}