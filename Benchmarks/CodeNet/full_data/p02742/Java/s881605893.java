import java.util.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	int h = itr.nextInt();
      	int w = itr.nextInt();
      	
 		int row1 = (w + 1) / 2;
      	int row2 = w / 2;
      
      	int i = 1;
      	BigInteger res = new BigInteger("0");
      
      	while (i <= h) {
        	if (i % 2 == 1) res.add(row1);
          	else res.add(row2);
        	i++;
        }
      
      	System.out.println(res);
    }
}
