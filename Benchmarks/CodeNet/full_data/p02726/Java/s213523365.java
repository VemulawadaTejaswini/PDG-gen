import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] A = new int[n];
        sc.close();
        for(int i=0;i<A.length;i++){
            A[i]=0;
        }

        int k;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                k=Math.min(j-i,Math.abs(i-x)+Math.abs(j-y)+1);
                A[k]=A[k]+1;
            }
        }        
        sc.close();
        for(int i=1;i<A.length;i++){
            System.out.println(A[i]);
        }

        // System.out.print(k);
        
    //     for(int i=0;i<A.length;i++){
    //         System.out.println(A[i]);
    //     }
    //     for(int i=0;i<B.length;i++){
    //         System.out.println(B[i]);
    //     }
    }
}