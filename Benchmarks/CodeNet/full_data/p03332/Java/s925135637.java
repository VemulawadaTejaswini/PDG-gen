import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();


		int Sum = 0;
		for(int i=0;i < k/a + 1;i++) {
			if((k-i*a)%b == 0) {
				int j = (k-i*a)/b;

				int Z = 0;
				int tmpI =i;


				while(tmpI >= 0 && j >=0) {
					if(n >= tmpI + j + Z) {
						Sum += stair(n)/(stair(tmpI)*stair(j)*stair(Z)*stair(n-tmpI-j-Z));
					}

					tmpI -=1;
					j -=1;
					Z += 1;
				}
			}
		}


		System.out.println(Sum);

	}

	public static int stair(int n) {
		int back = 1;

		while(n>1) {
			back = back * n;
			n = n-1;
		}
		return back;
	}



}