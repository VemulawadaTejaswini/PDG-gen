import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i=0;i <n;i++){
            A[i]=sc.nextInt();
        }
        sc.close();

        A = sort(A);
        int[] B = new int[n];
        B[0] = A[n-1]+k-A[0];
        for(int i=1;i<n;i++){
            B[i]=A[i-1]-A[i];
        }
        B = sort(B);
        // for(int i = 0 ;i<B.length;i++){
        //     System.out.println(B[i]);
        // }
        k=k-B[0];
        System.out.print(k);
        
        // int[] A = {8,7,456,54,7,42,47,5};
        // A = sort(A);
        // for(int i=0;i<A.length;i++){
        //     System.out.println(A[i]);
        // }
    }
        
    public static int[] sort(int[] a){
        int x;
        for(int i=0;i<a.length;i++){
            x = a[i];
            for(int j=0;j<a.length;j++){
                if(x == Math.max(x,a[j])){
                    a[i]=a[j];
                    a[j]=x;
                    x=a[i];
                }
            }
        }
        return a;
    }
}