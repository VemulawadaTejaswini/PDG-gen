import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long M = sc.nextLong();
        
        long[] a = new long[(int)(A)];
        for(int i = 0 ; i < A ; i++){
                a[i] = sc.nextLong();    
        }
        long[] b = new long[(int)(B)];
        for(int i = 0 ; i < B ; i++){
                b[i] = sc.nextLong();
        }
        int[] x = new int[(int)(M)];
        int[] y = new int[(int)(M)];
        long[] c = new long[(int)(M)];
        for(int i = 0 ; i < M ; i++){
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                c[i] = sc.nextInt();
        }
        long minA = a[0];
        for(int i = 1 ; i < a.length ; i++){
                minA = Math.min(minA, a[i]);
        }
        long minB = b[0];
        for(int i = 1 ; i < b.length ; i++){
                minB = Math.min(minB, b[i]);
        }
        //int z = x[1];
        //System.out.println(z);
        //System.out.println(a[z-1]);
        long min = minA + minB;
        //System.out.println(min);
        
        long[] n = new long[(int)(M)];
        for(int i = 0 ; i < M ; i++){
            n[i] = a[x[i]-1] + b[y[i]-1] - c[i];
            //System.out.println(n[i]);
            if(min > n[i]){
                min = n[i];
            }
        }
        System.out.print(min);
    }    
}