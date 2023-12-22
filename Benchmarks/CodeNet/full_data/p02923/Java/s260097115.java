import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0 ; i<n ; i++){
                a[i] = sc.nextInt();
            
            
        }
        int x = 0;
        int count = 0 ;
        for(int i = 0 ;i<n-1 ; i++){
             if(a[i]>=a[i+1]){
                 
                 
                 count++;
             }
            
            else
                 count = 0;
        }
                x = Math.max(x , count);
                
            
     System.out.println(x);
}
}