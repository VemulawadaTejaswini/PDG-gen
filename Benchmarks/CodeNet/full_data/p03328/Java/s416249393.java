import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int rod1 = scan.nextInt();
        int rod2 = scan.nextInt();
        
        int difference = rod2 - rod1;
        
        int rodall = 0;
        
        for (int i = 1 ; i <= difference ; i++){
            rodall = rodall + i;
        }
        
        int ans = rodall - rod2;
 
        System.out.println(ans);
        
    }
}