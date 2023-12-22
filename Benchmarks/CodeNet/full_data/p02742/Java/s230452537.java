import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	int h = itr.nextInt();
      	int w = itr.nextInt();
      
      	int row1 = (w + 1) / 2;
      	int row2 = w / 2;
      
      	int i = 0;
      	int res = 0;
      
      	while (i < h) {
        	if ((i & 1) == 0) res += row1;
          	else res += row2;
        }
      
      	System.out.println(res);
    }
}