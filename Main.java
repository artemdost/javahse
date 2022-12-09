import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array_size = 0, array[];
        boolean flag = true;

        System.out.print("Введите размерность массива: ");

        while (flag) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                array_size = scan.nextInt();
                while (array_size < 0) {
                    System.out.print("Введите размерность массива >= 0: ");
                    array_size = scan.nextInt();
                }
                break;
            }
            System.out.print("Введите целое число: ");
        }
        array = new int[array_size];
        for (int i = 0; i < array_size; i++)
            if (in.hasNextInt())
                array[i] = in.nextInt();

        for (int elem : array)
            System.out.print(elem + " ");
        System.out.print("\n");

        for (int i = 0; i < array_size / 2; i++) {
            int tmp = array[i];
            array[i] = array[array_size - 1 - i];
            array[array_size - 1 - i] = tmp;
        }

        for (int elem : array)
            System.out.print(elem + " ");


        in.close();
    }
}