import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int H = scan.nextInt();
			int W = scan.nextInt();

			String []s = new String[H];
			char[][]a = new char[H][W];
			for(int i = 0;i<H;i++) {
				s[i] = scan.next();
				a[i] = s[i].toCharArray();
			}

			for(int i = 0;i<H;i++) {
				boolean ok = true;
				for(int j = 0;j<W;j++) {
					if(a[i][j]=='#')ok = false;
				}
				if(ok==true) {
					Arrays.fill(a[i],'+');
				}
			}


			for(int i = 0;i<W;i++) {
				boolean ok = true;
				for(int j = 0;j<H;j++) {
					if(a[j][i]=='#')ok = false;
				}
				if(ok==true) {
					for(int j = 0;j<H;j++) {
						a[j][i]='+';
					}
				}
			}


			for(int i =0;i<H;i++) {
				int count = 0;
				for(int j = 0;j<W;j++) {

					if(a[i][j]!='+') {
						System.out.print(a[i][j]);
						count++;
					}
				}
				if(count!=0)
					System.out.println();
			}



		}


	}


}
