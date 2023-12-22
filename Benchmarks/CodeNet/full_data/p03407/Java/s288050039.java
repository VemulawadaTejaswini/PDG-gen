import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int coina = scan.nextInt();
        int coinb = scan.nextInt();
        int mane = scan.nextInt();
        
      	if(coina + coinb > mane){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}