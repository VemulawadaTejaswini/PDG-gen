import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int atotal = scanner.nextInt();
		int btotal = scanner.nextInt();
		int indexDis = scanner.nextInt();
		
		int alist[] = new int[atotal];
		for(int i=0;i<atotal; i++) {
			alist[i] = scanner.nextInt();
		}
		
		int blist[] = new int[btotal];
		for(int i=0; i<btotal; i++) {
			blist[i] = scanner.nextInt();
		}
		
		int[][] discounts = new int[indexDis][3];
			
		for(int i =0; i<indexDis; i++) {
			discounts[i][0] = scanner.nextInt();
			discounts[i][1] = scanner.nextInt();
			discounts[i][2] = scanner.nextInt();
		}

		
		int mina = alist[0];
		for(int i=0; i<atotal-1; i++) {
			if(mina > alist[i+1]) {
				mina = alist[i+1];
			}
		}
		
		int minb = blist[0];
		for(int i=0; i<btotal-1; i++) {
			if(minb > blist[i+1]) {
				minb = blist[i+1];
			}
		}
		//割引券のある列を買った場合
		int minab = alist[discounts[0][0]] + blist[discounts[0][1]]- discounts[0][3];
		for(int i=0; i< indexDis; i++) {
			if(minab > alist[discounts[i+1][0]] + blist[discounts[i+1][1]]- discounts[i+1][3]) {
				minab = alist[discounts[i+1][0]] + blist[discounts[i+1][1]]- discounts[i+1][3];
			}
		}
		
		
		System.out.println(Math.min(mina+minb, minab));
	}
		

	
}