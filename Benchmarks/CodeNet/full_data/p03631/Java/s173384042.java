import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		if(n%100 == n-(n%10)*10) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
