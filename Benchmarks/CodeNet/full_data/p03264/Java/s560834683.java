import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		System.out.println(var(A));
		
		sc.close();
	}
	
	public static int var(int A){
		if (A==2)
			return 1;
		
		else {
			return var(A-1)+A/2;
		}
			
	}

}
	
