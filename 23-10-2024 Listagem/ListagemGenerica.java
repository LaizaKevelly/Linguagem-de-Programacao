public class ListagemGenerica {
    public static <T> void listArray(T[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }System.out.println("}");
    }

    public static void main(String [] args) {
        Integer [] array1 = new Integer [] {1, 2, 1, 4, 5};        
        int [] array2 = new int[5];
        Double [] array3 = new Double [] {1.0, 2.0, 1.0, 4.0, 5.0};
        Character [] array4 = new Character [] {'A', 'B', 'C', 'D'};
        listArray(array1);
    }
}
