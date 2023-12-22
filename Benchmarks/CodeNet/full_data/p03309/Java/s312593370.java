import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		//ArrayList<Integer> numArray = new ArrayList<>();
		int numArray[] = new int[N];
		int absArray[] = new int[N];

		int ans = 0;
		for(int i = 0; i < N; i++){
			numArray[i] = sc.nextInt();
			//numArray.add(sc.nextInt());
			absArray[i] = abs(numArray[i],i+1);
			}

		for(int i = 0; i < N; i++){
			ans += absArray[i];
		}

		System.out.println(ans);

	}

	private static int abs(int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		int a = x - y;

		a = Math.abs(a);
		//System.out.println(a);
		return a;
	}

}
