import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int cnt = 0;
		for(int i = 1;i <= N/2;i++){
			cnt++;
		}
		if(N==1 || N==2 || N==3){
			System.out.println(1);
			return;
		}
		System.out.println(N%2==0 ? --cnt : cnt);
	}
}