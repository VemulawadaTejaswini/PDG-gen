import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();

		int rgb = R*100+G*10+B;
		int B1;
		int C1;

		int A2;
		int B2;
		int C2;

		int tmp = 0;

		if(rgb % 4 ==0){
			System.out.println("YES");
			return;
		}else{
			System.out.println("NO");
			return;
		}

	}

}
