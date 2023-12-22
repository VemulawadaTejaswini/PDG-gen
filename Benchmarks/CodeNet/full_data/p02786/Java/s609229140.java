import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long multiple = 1;
		while(H > 0) {
			H = H / 2;
			multiple *= 2;
		}
		System.out.println(multiple - 1);
 
	
	}
}