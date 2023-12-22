import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[q];
        for(int i=0; i<q; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = 0;
        }
        for(int i=0; i<q; i++) {
            int winner = a[i]-1;
            b[winner]+=1;
        }
        for(int i=0; i<n; i++) {
            System.out.println(b[i]+k-q>0 ? "Yes" : "No");
        }
    }
}
