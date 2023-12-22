import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int a[] = new int [N-1];
        
        
        for(int i=0;i<N-1;i++){
            a[i] = sc.nextInt();
        }
        
        int count = a[0] + a[N-2];
        
        
        for(int i=0;i<N-2;i++){
        
            count += Math.min(a[i],a[i+1]);
        
        }
        
        System.out.println(count);
        
        
    }
}
