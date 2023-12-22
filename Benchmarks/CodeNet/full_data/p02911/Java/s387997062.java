import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int n = cin.nextInt();
        int k = cin.nextInt();
        int q = cin.nextInt();

        int[] a = new int[n];
        for(int i=0;i<q;i++) {
            a[cin.nextInt()-1]++;
        }
        for(int i=0;i<n;i++) {
            if(k - q + a[i] > 0) cout.println("Yes");
            else cout.println("No");
        }

        cout.close();
    }
}
