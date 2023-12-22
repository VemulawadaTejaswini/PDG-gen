import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =    sc.nextInt();
		String b = sc.next();
		
		if(a < 3200) {
			b = "red";
		}
       System.out.println(b);
	}
}