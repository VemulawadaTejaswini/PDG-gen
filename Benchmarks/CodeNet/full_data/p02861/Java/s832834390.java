import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        double total = 0;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i == j) continue;

                total += Math.sqrt(Math.pow(x[i]-x[j], 2) + Math.pow(y[i]-y[j], 2));
            }
        }
        
        System.out.println(total/n);
    }
}