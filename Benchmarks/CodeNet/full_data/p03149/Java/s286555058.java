import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[4];
		for(int i=0;i<4;i++) {
			num[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		for(int i=0;i<4;i++) {
			if(!(num[i] == 1||num[i]==4||num[i]==7||num[i]==9)) {
				System.out.println("NO");
				return;
			}
		}

		int n = 21;
		for(int i=0;i<4;i++) {
			n-=num[i];
		}
		if(n == 0){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
