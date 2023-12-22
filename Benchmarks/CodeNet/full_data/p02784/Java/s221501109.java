import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int h = scan.nextInt();
        int n = scan.nextInt();
        int[] a = new int[n];
        int b = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            b = b + a[i];
        }
        if(h > b){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}