import java.util.*;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if((A != 1) && (B != 1)) {
				System.out.println(1);
			}else if((A != 2) && (B != 2)) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
			
}
}