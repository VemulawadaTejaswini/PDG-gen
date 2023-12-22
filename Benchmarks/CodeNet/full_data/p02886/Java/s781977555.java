import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int n = cin.nextInt();
        int[] d = new int[n];
        for(int i=0;i<n;i++) d[i] = cin.nextInt();
        long sum = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                sum += d[i] * d[j];
            }
        }

        cout.println(sum);
        cout.close();
    }
}