import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i1g = 0;
		int i2g = 1;

		int g[] = new int[5];
		g[0] = 4;
		g[1] = 6;
		g[2] = 9;
		g[3] = 11;

		if (i1 == 2 && i2 == 2 ){
			System.out.println("Yes");
		}else{

			for (int  i=0; i<4; i++){
				if (i1 == g[i]){
					i1g =2;
				}
				if (i2 == g[i]){
					i2g =2;
				}
			}
			if (i1 == i2){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

		sc.close();
	}

}