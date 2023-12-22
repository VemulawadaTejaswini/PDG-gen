import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=N-1;i>=0;i-=2){
        	System.out.print(a[i] + " ");
        }
        for(int j=N%2;j<N;j+=2){
        	System.out.print(a[j] + " ");
        }
   }
}
