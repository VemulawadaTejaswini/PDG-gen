//B
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        
        int a[] = new int[n];
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            sum += a[i];
        }
        
        Arrays.sort(a);
        
        boolean flag = true;
        
        for(int i = n - 1; i > n - 1 - m; i--){
            if(a[i] < sum * 1 / (4 * m)){
                
                flag = false;
            }
            //System.out.println(a[i] + " " + sum * 1 / (4 * m));
        }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
