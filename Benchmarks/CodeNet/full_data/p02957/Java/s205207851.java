import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisuA = scan.nextInt();
		int  seisuB = scan.nextInt();
		boolean flg = false;
		int re = 0;

		for(int k=0;k<Math.max(seisuA, seisuB);k++) {

			if(Math.abs(seisuA-k) == Math.abs(seisuB-k)){
				re = k;
				flg = true;
				break;
			}
		}
		System.out.println(flg?re:"IMPOSSIBLE");
		scan.close();

	}

}
