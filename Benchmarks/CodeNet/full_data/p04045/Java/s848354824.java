import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		IrohasObsession iroha = new IrohasObsession();
		iroha.run();
	}
}

class IrohasObsession {
	
	int N;
	int K;
	int[] dislikeNums;
	
	IrohasObsession() {
		//input
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.K = cin.nextInt();
		this.dislikeNums = new int[K];
		for (int i = 0; i < K; i++) {
			dislikeNums[i] = cin.nextInt();
		}
	}
	
	void run() {
		int i = N;
		while (true) {
			if (!isContains(i)) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
	
	boolean isContains(int num) {
		char[] tmpNums = String.valueOf(num).toCharArray();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < tmpNums.length; i++) {
			list.add(Integer.valueOf(String.valueOf(tmpNums[i])));
		}
		for (int i = 0; i < K; i++) {
			if (list.contains(this.dislikeNums[i])) {
				return true;
			}
		}
		return false;
	}
	
}
