import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
		
		
		String [][] C = new String[H][W];//*or.
		String[]scanline = new String[H];
		
		for(int i = 0;i<H;i++){
			scanline[0] = scan.next();
			
		}
		
		
		for(int i = 0;i<H;i++){
			for(int j = 0;j<W;j++){
				C[i][j] = scanline[i].substring(j, j+1);
			}
		}
		
		//String[][]X = new String[2*H][W];
		
		for(int i = 0;i<H;i++){
			for(int j = 0;j<W;j++){
				System.out.print(C[i][j]);
			}
			System.out.println();
			
			for(int k = 0;k<W;k++){
				System.out.print(C[i][k]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}