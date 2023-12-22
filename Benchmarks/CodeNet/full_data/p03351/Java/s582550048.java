import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
		int d = sc.nextInt();
		
		
		if(a - b >=d && b-c >=d) {
			System.out.print("YES");
		}else {
			System.out.println("NO");
		}

	}
	}
	