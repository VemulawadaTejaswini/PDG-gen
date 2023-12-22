import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 3; i < 55555; i++) {
			if(isCheck(i)) {
				list.add(i);
			}
		}

//		ArrayList<Integer> ans = new ArrayList<Integer>();
//		ans.add(2);
		int []k = new int[N];
		k[0] = 2;
		int cnt = 0;
		for(int i = 0; i < list.size(); i++) {
			int a = list.get(i);
			if(a % 5 == 1) {
				cnt++;
				k[cnt] = a;
			}
			if(cnt == N - 1) {
				break;
			}
		}
		for(int i = 0; i < 5; i++) {
			if(i != 4) {
				System.out.print(k[i] + " ");
			}else {
				System.out.println(k[i]);
			}

		}

	}
	public static boolean isCheck(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}