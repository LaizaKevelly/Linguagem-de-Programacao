public class ListaInteiros {
    private int[] valoresInteiros = null;
    private int qtd = 0;

    public ListaInteiros(int tam) {
        valoresInteiros = new int[tam];
    }

    public void adicionar(int item) {
        valoresInteiros[qtd] = item;
        qtd++;
    }

    public void listar() {
        System.out.print("{");
        for (int i = 0; i < qtd; i++) {
            System.out.print(valoresInteiros[i] + " ");
        }System.out.println("}");
    }
}
