import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            sum += x[i];
        }
        int p = sum / n;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < x.length; i++) {
            sum1 += Math.pow(p - x[i], 2); 
            sum2 += Math.pow(p + 1 - x[i], 2); 
        }
        System.out.println(Math.min(sum1, sum2));
        sc.close();
    }
}