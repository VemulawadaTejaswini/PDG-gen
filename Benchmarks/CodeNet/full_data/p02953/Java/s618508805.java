import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int flag1 = 0;
		b[0] = 1;
		
		for(int i = 1; i < n ; i++) {
			b[i] = a[i] - a[i-1];
			if(b[i] <= -2||(b[i] == -1 && b[i-1] == 0)) {
				flag1++;
				break;
			 }
			
			if(b[i] == -1 && b[i-1] > 0) {
				a[i-1] = a[i-1] - 1;
			    b[i] = a[i] - a[i-1];
			}
		
		}
		if(flag1 == 1) 
			System.out.println("No");
		if(flag1 == 0)
			System.out.println("Yes");
		
		

	}

}
