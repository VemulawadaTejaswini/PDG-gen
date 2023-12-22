import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean isTrue = false;
		
		if (n % 7 == 0)
			isTrue = true;
		
		if (n % 4 == 0)
			isTrue = true;
				
		System.out.println(isTrue ? "Yes" : "No");
	}
}