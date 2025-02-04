import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		int [] L = new int [N+1];
		int [] R = new int [N+2];
		
		String color = sc.next(); 
		
		int left = 0;
		for (int i=0;i<N;i++) {
			if (color.charAt(i) == '#')
				left+=1;
			L[i+1]=left;
		}
		
		if (N!=1)
			L[N]=L[N-1];
		
		int right = 0;
		for (int i=N;i>0;i--) {
			if (color.charAt(i-1) == '.')
				right+=1;
			R[i]=right;
		}
		
		if (N!=1)
			R[0]=R[1];
		
		
		int tile = 100000;
		for (int i=1;i<N+1;i++)
			tile = Math.min(L[i-1]+R[i+1], tile);
		
		System.out.print(tile);
	}
}