import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] l = new int[n];
        int[] a = new int[n + 1];
        int b = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            l[i] = scan.nextInt();
            b += l[i];
            if(b <= x){
                c++;
            }
        }
        System.out.println(c + 1);
    }
}