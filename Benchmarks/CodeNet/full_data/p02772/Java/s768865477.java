import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		boolean flag = true;
		
		
		for(int i = 0; i < n; i++) {
			if(a[i]%2==0) {
				if(a[i]%3!=0 && a[i]%5!=0) {
					flag = false;
				}
				
			}
			
			
			
		}
		
		if(flag) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
		
	}

}
