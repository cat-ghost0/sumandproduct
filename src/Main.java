
public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,1,8,6};
        int summa = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
            product *= array[i];
        }
      System.out.println(" summa = " + summa);
        System.out.println(" product = " + product);

    }
}