import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();
		int minc =1001;
		for (int i = 0; i < N; i++) {
			int ci = sc.nextInt();
			int ti = sc.nextInt();
			if(ti<=T&&ci<minc){
				minc=ci;
			}
		}
		if(minc ==1001){
			System.out.println("TLE");
			return;
		}
		System.out.println(minc);
	}

}