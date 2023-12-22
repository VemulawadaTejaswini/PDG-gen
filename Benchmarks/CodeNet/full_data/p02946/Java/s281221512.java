import java.util.Scanner;

class Main {

	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		
		int l = Math.max(x-n+1, -1000000);
		int r = Math.min(x+n-1, 1000000);
		
		for(int i=l;i<=r;i++)
			System.out.print(i+" ");
		
		System.out.println();
		
		
		
		
		
	}
}
