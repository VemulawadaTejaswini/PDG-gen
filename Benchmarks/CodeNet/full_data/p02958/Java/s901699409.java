import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            p[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(p[i] - 1 != i){
                a++;
            }
        }
        if(a <= 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}