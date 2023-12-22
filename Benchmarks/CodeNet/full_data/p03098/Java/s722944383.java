import java.util.*;
import java.io.*;

public class Main {
    static int[] f(int[] p, int[] q){
        int[] a = new int[p.length];
        for(int i=0; i<a.length; i++) a[p[i]-1] = q[i];
        return a;
    }

    static void printArray(int[] array){
        for(int n=0; n<array.length; n++){
            System.out.print(array[n]);
            if(n==array.length-1) System.out.println();
            else System.out.print(" ");
        }
    }

    static int[] fPow(int[] p, int[] q, int K){
        int[] cur = Arrays.copyOf(p, p.length);
        int[] next = Arrays.copyOf(q, q.length);
        for(int k=0; k<K; k++){
            if(k>0 && Arrays.equals(p,cur) && Arrays.equals(q,next)){
                //System.err.printf("period: %d",k);
                return fPow(p, q, K%k);
            }
            int[] a = f(cur,next);
            if(Arrays.equals(cur,a)&&Arrays.equals(next,a))return a;
            cur = next;
            next = a;
            if(k==K-1) return cur;
        }
        return cur;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt()-1;
        int[] p = new int[N], q = new int[N];
        for(int n=0; n<N; n++) p[n]=sc.nextInt();
        for(int n=0; n<N; n++) q[n]=sc.nextInt();

        printArray(fPow(p,q,K));

    }
}