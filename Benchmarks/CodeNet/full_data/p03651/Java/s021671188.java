/**
 * Created by 卢嘉昊 on 2017/7/23.
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        //read in
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt();
        int A[] = new int[N];
        int max = 0;
        for(int i=0;i<N;i++){
            A[i] = scan.nextInt();
            max = max>A[i]?max:A[i];
        }
        //solution
        if(k>max){
            System.out.println("IMPOSSIBLE");
            return;
        }
        int g,a,b;
        if(N==1){
            if(A[0] == k){
                System.out.println("POSSIBLE");
                return;
            }else{
                System.out.println("IMPOSSIBLE");
                return;
            }
        }
        a = A[0];
        b = A[1];
        g = gcd(a,b);
        for(int i=2;i<N;i++){
            b = A[i];
            g = gcd(g,b);
        }
        if(k%g != 0){
            System.out.println("IMPOSSIBLE");
            return;
        }else{
            System.out.println("POSSIBLE");
            return;
        }
    }
    public static int gcd(int a,int b){
        if(a==b) return a;
        int big = a>b?a:b;
        int small = a<b?a:b;
        if(big%small==0){
            return small;
        }else{
            return gcd(big%small,small);
        }
    }
}
