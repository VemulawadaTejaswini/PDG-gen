import java.util.Scanner;

class Main {
    public static void main (String[] arg) {
        long N, sum = 0;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        scanner.close();

        for (int m = 1; m <= N; m++) {
            if (N%m == N/m) {
                sum += m;
            }
        }


        System.out.println(sum);
    } 
}