import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []a = new int [n+1];
		int []b = new int [n];
		
		for(int i = 0; i<= n ;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int j = 0; j< n ;j++) {
			b[j] = sc.nextInt();
		}
		
		int hunt = 0;
		for(int i = 0; i < n ; i++) {
			if(a[i] >= b[i]) {
				hunt += b[i];
			}
			if(a[i] < b[i]) {
				b[i] = b[i] - a[i];
				hunt += a[i];
				
				if(a[i+1] >= b[i]) {
					a[i+1] = a[i+1] - b[i];
					hunt += b[i];
				}
				if(a[i+1] < b[i]) {
					hunt += a[i+1];
					a[i+1] = 0;
				}	
			}
		   }
		System.out.println(hunt);
		}
		
		

	}


