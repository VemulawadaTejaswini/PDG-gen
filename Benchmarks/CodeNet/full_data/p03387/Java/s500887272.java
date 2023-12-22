import java.util.*;

public class Main {
	int A, B, C;
	int[] vals = new int[3];
	int result = 0;

	private Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		A = Integer.parseInt(tokens[0]);
		B = Integer.parseInt(tokens[1]);
		C = Integer.parseInt(tokens[2]);
		vals[0] = A;
		vals[1] = B;
		vals[2] = C;
		Arrays.sort(vals);
		in.close();
	}

	private void calc() {
		// littleとmedに1ずつn回足して，med == largeにする
		int addOne = vals[2] - vals[1];
		vals[0] += addOne;
		vals[1] += addOne;
		result += addOne;
		// large - little % 2 == 0なら，(large-little)/2回2をlittleに足して完了
		// そうでない場合は，(lare+1-little)/2回2をlittleに足し，最後にlargeとmiddleに1を足す
		if ((vals[2] - vals[0]) % 2 == 0) {
			result += (vals[2] - vals[0]) / 2;
		} else {
			result += (vals[2] + 1 - vals[0]) / 2 + 1;
		}

	}

	private void show() {
		System.out.println(result);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}
}