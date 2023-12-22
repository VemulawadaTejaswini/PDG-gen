import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0 ; i<n ; i++){
                a[i] = sc.nextInt();
            
            
        }
        int x = 0;
        int count = 0 ;
        for(int i = 0 ;i<n-1 ; i++){
             if(a[i]>=a[i+1]){
                 
                 count++;
                 b[i] =count;
             }
            
            else
                 count = 0;
        }
               Arrays.sort(b);
                
            
     System.out.println(b[n-1]);
}
}