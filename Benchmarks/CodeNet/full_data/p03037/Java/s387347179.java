import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int card = scan.nextInt();
		int gate = scan.nextInt();
		int[] start = new int[gate];
		int[] end = new int[gate];
		int maxS = 0;
		int minE = 0;
		int re = 0;

		for(int i=0;i<gate;i++) {
			start[i] = scan.nextInt();
			end[i] = scan.nextInt();

			maxS = Math.max(maxS, start[i]);
			minE = Math.min(minE, end[i]);
		}

		re = minE-maxS+1;
		System.out.println(re>0?re:0);
		scan.close();

	}

}
