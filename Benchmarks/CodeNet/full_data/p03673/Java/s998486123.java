import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        a[0] = sc.nextInt();
        for(int i=1; i<n; i++){
            a[i] = sc.nextInt();
            for(int j=0; j<i/2; j++){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
   }
}
