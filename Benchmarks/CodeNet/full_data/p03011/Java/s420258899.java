import java.util.*;

public class Main{

	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        
        int P = scanner.nextInt(); // A-B
        int Q = scanner.nextInt(); // B-C
        int R = scanner.nextInt(); // C-A
        
        // A-B-C
        int t = P + Q;
        
        // C-A-B
        if(t > R+P){
        	t = R + P;
        }
        
        // B-C-A
        if(t > Q+R){
        	t = Q + R;
        }
        
        System.out.println(t);
    }

}