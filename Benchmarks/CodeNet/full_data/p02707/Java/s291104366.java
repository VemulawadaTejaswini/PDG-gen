import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n - 1];
        int[] out = new int[n];
        for(int i = 0; i < n - 1; i++) {
            a[i] = scan.nextInt();
            out[a[i] - 1]++;
        }
        for(int i = 0; i < n; i++) System.out.println(out[i]);
        scan.close();
    }
}