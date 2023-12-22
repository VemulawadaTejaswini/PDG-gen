import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		int[] a=new int[3];
		int[] b=new int[3];
		int[][] c=new int[3][3];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				c[i][j]=scanner.nextInt();
			}
		}
		
		
		for(int i=0;i<3;i++) {
			b[i]=c[0][i];
		}
		
		a[0]=0;
		a[1]=c[1][0]-b[0];
		a[2]=c[2][0]-b[0];
		
		boolean wronganswer=false;
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				if(c[i][j]!=a[i]+b[j]) {wronganswer=true;};
			}
		}

		if(wronganswer) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

		scanner.close();

	}
}