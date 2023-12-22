import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            int i1 = scan.nextInt();
            ar[i] = i1;
        }
        int min = ar[0] == 0 && n > 2? ar[1]:ar[0];
        int max = ar[n-1];

        System.out.println(Math.min(p-max+min,max-min));
    }
}