import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		char [] L = new char[N];
		
		String color = sc.next(); 
		
		for (int i=0;i<N;i++) {
			L[i] = color.charAt(i);
			
		}
		int count = 0;
		for (int i=N-1;i>0;i--) {
			if (L[i] == '.' && L[i-1] == '#'){
				count+=1;
				L[i-1] = '.';
			}
		}
		System.out.print(count);

		
		
		
		
		
	}

}