import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int pret = 0,prex = 0,prey = 0;
		boolean f = true;
		for (int i = 0; i < n; i ++) {
			int t = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();

			int d = Math.abs(x - prex) + Math.abs(y - prey);

			int dt  = t - pret;

			if(dt < d || (dt - d) % 2 == 1){
				f =false;
				break;
			}
			pret = t;prex = x;prey = y;
		}

		if(f){
			System.out.println("Yes");
		}else
			System.out.println("No");
	}
}
