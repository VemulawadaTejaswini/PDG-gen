import java.util.*;
public class Main {
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int cake = 4;
		int donutsu = 7;
		
		if (a%donutsu%cake == 0|| a%cake%donutsu == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
