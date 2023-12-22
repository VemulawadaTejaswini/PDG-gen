import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		for(int i = 0; i < 4; i++) {
			String str = sc.next();
			if(str.equals("+"))		n++;
			else	n--;
		}
		
		System.out.println(n);

	}

}
