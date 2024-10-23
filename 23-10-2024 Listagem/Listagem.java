public class Listagem {
    public static void listArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }System.out.println("}");
    }

    public static void listArray(double[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }System.out.println("}");
    }

    public static void listArray(char[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }System.out.println("}");
    }

    public static void main(String [] args) {
        int [] array1 = new int [] {1, 2, 1, 4, 5};
        int [] array2 = new int[5];
        double [] array3 = new double [] {1.0, 2.0, 1.0, 4.0, 5.0};
        char[] array4 = new char[] {'A', 'B', 'C', 'D'};
        listArray(array1);
    }
}
