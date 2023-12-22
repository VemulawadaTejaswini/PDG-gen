import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] a = new char[H][];
		for(int i=0; i<H; i++) {
			a[i] = sc.next().toCharArray();
		}
		
		boolean ok = true;
		int i=0,j=0;
		while(!(i==H-1 && j==W-1)) {
			int bit = 0;
			if(i<H-1 && a[i+1][j]=='#')
				bit|=1;
			if(j<W-1 && a[i][j+1]=='#')
				bit|=2;
			if(bit==3) {
				ok = false;
				break;
			}
			if(bit==1)
				i++;
			else
				j++;
		}
		
		System.out.println(ok ? "Possible" : "Impossible");
		sc.close();
	}
}
