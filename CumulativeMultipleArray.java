import java.util.Arrays;
import java.util.Scanner;

public class CumulativeMultipleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int arrNum[] = new int[n];

        System.out.println("Enter " + n + " integers for the array:");

        for (int i = 0; i < n; i++) {
            arrNum[i] = scanner.nextInt();
        }

        scanner.close();

        try {
            for (int i = 1; i < arrNum.length; i++) {
                arrNum[i] *= arrNum[i - 1];
            }
            System.out.println("arrNum = " + Arrays.toString(arrNum));
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
