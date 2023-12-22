import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] A = new int[N];
       for(int i = 0; i < N; ++i) {
           A[i] = sc.nextInt();
       }
       
       int max = 0; //繰り返すことができる最大回数
       int[] B = new int[N];    //Aに対する操作後の値を格納する配列
       
       for (int i = 0; i < N; ++i){
           if(A[i] % 2 == 0) {
               B[i] = A[i] / 2;
           ++max;
           }
       }
       
       //出力
       System.out.println(max);
    }
}