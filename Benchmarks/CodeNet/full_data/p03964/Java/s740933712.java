import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        long tscore = 1;
        long ascore = 1;
        for (int i = 0; i < n; i++) {
            long nn = (long) Math.max(Math.ceil((double) tscore / t[i]), Math.ceil((double) ascore / a[i]));
            tscore = nn * t[i];
            ascore = nn * a[i];
        }
        System.out.println(tscore + ascore);
    }

}
