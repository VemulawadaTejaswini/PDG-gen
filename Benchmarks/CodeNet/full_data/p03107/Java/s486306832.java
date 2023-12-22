import java.util.*;

public class Main {
	String S;
	int result = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		S = in.nextLine();
		in.close();
	}

	void calc() {
		int zeroNum = 0, oneNum = 0;
		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) == '0') {
				++zeroNum;
			} else {
				++oneNum;
			}
		}
		result = Math.min(zeroNum, oneNum) * 2;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}
