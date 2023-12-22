import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int turn[] = new int[num];
		int px[] = new int[num];
		int py[] = new int[num];

		for(int k=0;k<num;k++){
			turn[k] = sc.nextInt();
			px[k] = sc.nextInt();
			py[k] = sc.nextInt();
		}

		int t = 0;
		int x = 0;
		int y = 0;

		int nex=0;
		int n=0;
		while(n<num){
			if(((Math.abs(x - px[n]) + Math.abs(y - py[n])) > turn[n] - nex) ||
				(Math.abs(x - px[n]) + Math.abs(y - py[n]) %2 != (turn[n] - nex)%2 )){
				break;
			}
			x = px[n];
			y = py[n];
			nex = turn[n];
			n++;
		}

		if(n == num) System.out.println("Yes");
		else System.out.println("No");

	}
}