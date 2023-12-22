import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[a[i] - 1] = i + 1;
        }
        for(int i = 0; i < n; i++){
            System.out.print(b[i] + " ");
        }
    }
}