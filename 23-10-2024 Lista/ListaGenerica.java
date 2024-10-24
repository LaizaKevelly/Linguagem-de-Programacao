public class ListaGenerica <T> {
    private T[] valoresGenericos = null;
    private int qtd = 0;

    public ListaGenerica(int tam) {
        valoresGenericos = new T[tam];
    }

    public void adicionar(T item) {
        valoresGenericos[qtd] = item;
        qtd++;
    }

    public void listar() {
        System.out.print("{");
        for (int i = 0; i < qtd; i++) {
            System.out.print(valoresGenericos[i] + " ");
        }System.out.println("}");
    }
}
