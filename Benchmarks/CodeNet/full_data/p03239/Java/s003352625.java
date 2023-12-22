import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c[][] = new int[a][2];
		
		for (int i=0; i<a; i++){
			c[i][0] = sc.nextInt();
			c[i][1] = sc.nextInt();
		}
		
		boolean flg = false;
		int kai = 0;
		for (int i=0; i<a; i++){
			if (c[i][1] <= b){
				kai = c[i][0];
				flg = true;
			}
			
		}
		
		if (flg){
			System.out.println(kai);
		}
		else {
			System.out.println("TLE");
		}
		return;
		
		
	}

}
