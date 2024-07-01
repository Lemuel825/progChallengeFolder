import java.util.Scanner;

public class Task14SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++)
            {
                array[i] = scanner.nextInt();
            }

        int sum = 0;
        for (int num : array)
            {
                sum += num;
            }

        double average = n > 0 ? (double) sum / n : 0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
