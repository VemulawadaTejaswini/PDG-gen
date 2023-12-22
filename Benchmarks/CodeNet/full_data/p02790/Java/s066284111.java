import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.next();
		String b = stdIn.next();
		
		for(int i = 0; i < b.length(); i++) {
			a += a.substring(0);
		}
		for(int i = 0; i < a.length(); i++) {
			b += b.substring(0);
		}
		
		if(a.compareTo(b)>0) {
			System.out.println(b);
		}else {
			System.out.println(a);
		}
		
	}

}
