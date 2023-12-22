import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long[] num = new long[100001];
        for(int i=0; i<=100000; i++){
            num[i] = 0;
        }

        for(int i=0; i<N; i++){
            num[a[i]] += b[i];
        }
        long sum = 0;
        for(int i=0; i<100001; i++){
            sum += num[i];
            if(sum>=K){
                System.out.println(i);
                break;
            }
        }
    }
}