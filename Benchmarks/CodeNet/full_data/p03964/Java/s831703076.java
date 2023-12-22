import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] t = new long[N];
        long[] a = new long[N];
        for(int i = 0;i < N;i++){
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        long A = t[0];
        long B = a[0];
        for(int i = 1;i < N;i++){
            long k = 1;
            long x = t[i];
            long y = a[i];
            while(x < A || y < B){
                k++;
                x = k*t[i];
                y = k*a[i];
            }
            A = x;
            B = y;
        }

        System.out.println(A+B);
    }
}
