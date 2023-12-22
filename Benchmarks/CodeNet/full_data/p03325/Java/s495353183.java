import java.util.*;
 
public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] a = new int[N];
       for(int i = 0; i < N; ++i) {
           a[i] = sc.nextInt();
       }
       
       int max = 0; 
       int[] b = new int[N];
       
       for (int i = 0; i < N; ++i){
           if(a[i] % 2 == 0) {
               b[i] = A[i] / 2;
           ++max;
           }
       }
       System.out.println(max);
    }
}