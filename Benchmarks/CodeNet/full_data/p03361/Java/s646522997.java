import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();

		char[][] b=new char[h][];
		for(int i=0;i<h;i++){
			b[i]=sc.next().toCharArray();
		}
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(b[i][j]=='#' 
						&&(i!=0 && b[i-1][j]=='.')
						&&(j!=0 && b[i][j-1]=='.')
						&&(i!=h-1 && b[i+1][j]=='.')
						&&(j!=w-1 && b[i][j+1]=='.')){
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
	}
	
	public static int gcd(int a, int b) {
		return a%b==0 ? b : gcd(b,a%b);
	}
}
