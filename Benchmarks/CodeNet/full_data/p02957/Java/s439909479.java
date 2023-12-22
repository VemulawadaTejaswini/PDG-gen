import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean flag = false;
		
		for(int i=1;i<Math.pow(10, 9);i++) {
			int a = Math.abs(A-i);
			int b = Math.abs(B-i);
			if(a==b) {
				System.out.println(i);
				flag = true;
			}
			
		}
		
		if(flag == false)System.out.println("IMPOSSIBLE");
		
		sc.close();	
	}

}