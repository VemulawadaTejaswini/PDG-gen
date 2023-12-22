import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		boolean flag = false;
		if(e - a > k) {
			flag = true;
		}
		
		if(flag) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
		
	}
}