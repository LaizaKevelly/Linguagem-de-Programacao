public class Morador {
    private String nome;
    private int numIdade;
    private int quantidResidentes;
    private int numVotacao;
    private int votos;
    
    public Morador(String n, int idade, int residentes, int numero) {
        this.nome = n;
        this.numIdade = idade;
        this.quantidResidentes = residentes;
        this.numVotacao = numero;
    }

    public void adicionarVoto() {
        this.votos++;
    }

    //----------------------- getters
    public String getNome() {
        return nome;
    }

    public int getNumIdade() {
        return numIdade;
    }

    public int getQuantidResidentes() {
        return quantidResidentes;
    }

    public int getNumVotacao() {
        return numVotacao;
    }

    public int getVotos() {
        return votos;
    }


    
}
