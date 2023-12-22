import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int rest = scan.nextInt();
      	int ans = (3 * a + rest) / 2;
      	System.out.print(ans);
    }

}