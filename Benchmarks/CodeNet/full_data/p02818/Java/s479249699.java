import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		if(a>=c) {
			System.out.println(a-c);
			System.out.println(b);
		}else {
			System.out.println(0);
			if(b>c-a) {
			System.out.println(b-c+a);
			}else {
				System.out.println(0);
			}
		}
			
		


		sc.close();
	}
}
