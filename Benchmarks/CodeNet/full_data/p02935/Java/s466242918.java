import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] foodValues = new double[n];
        for (int i = 0; i < n; i++) {
            foodValues[i] = sc.nextDouble();
        }

        Arrays.sort(foodValues);
        double value = foodValues[0];

        for (int i = 1; i < n; i++) {
            value = (value + foodValues[i])/2;
        }

        System.out.println(value);
    }
}