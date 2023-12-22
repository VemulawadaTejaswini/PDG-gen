import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int multiplier = scan.nextInt();
        int numder = scan.nextInt();
        
        int minnumder = 1;
        
        if (multiplier > 0){
            for(int i = 0; i < multiplier ; i++){
                minnumder = minnumder * 100;
            }
        }else{
            
        }
        
        int ans = minnumder * numder;
 
        System.out.println(ans);
    }
}