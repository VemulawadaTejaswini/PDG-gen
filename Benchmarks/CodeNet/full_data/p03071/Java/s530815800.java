import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = 0;
		int min = 0;
		
		max = Math.max(a, b);
		min = Math.min(a, b);
		if(max-1 >= min) {
			System.out.println(max+max-1);
		}else {
			System.out.println(max+b);
		}
    }
}
