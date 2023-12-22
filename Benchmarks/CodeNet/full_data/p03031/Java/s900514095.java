import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		ArrayList<Denkyu> denkyu = new ArrayList<>();
		for(int j = 0; j < M; j++) {
			Denkyu d = new Denkyu(j+1);
			int k = Integer.parseInt(sc.next());
			ArrayList<Integer> inputList = new ArrayList<>();
			for(int i = 0; i < k; i++) {
				inputList.add(Integer.parseInt(sc.next()));
			}
			d.setS(inputList, N);
			denkyu.add(d);
		}
		for(int i = 0; i < M; i++) {
			denkyu.get(i).p = Integer.parseInt(sc.next());
			//denkyu.get(i).output();
		}

		sc.close();

		int answer= 0;
		int gudge = 0;
		int kaisu = (int) Math.pow(2, N);
		for(int i = 0; i < kaisu; i++) {
			String fmt = "%0"+N+"d";
			String a = Integer.toBinaryString(i);
			String b = String.format(fmt, Integer.parseInt(a));

			String[] input = b.split("");
			int[] inputSwitch = new int[N];
			for(int j = 0 ; j < N ; j++) {
				inputSwitch[j] = Integer.parseInt(input[j]);
			}

			gudge = 0;
			for(Denkyu d : denkyu) {
				gudge += d.check(inputSwitch);
			}

			if(gudge == M) {
				answer += 1;
			}

		}

		System.out.println(answer);
	}
}

class Denkyu {
	int no=0;
	ArrayList<Integer> s;
	int p;

	Denkyu(int no){
		this.no = no;
	}

	void setS(ArrayList<Integer> list, int N) {
		s = new ArrayList<Integer>();

		for(int i = 0; i < N; i++) {
			if(list.contains(i+1)) {
				s.add(1);
			}else {
				s.add(0);
			}
		}
	}

	int check(int[] switchInput){
		int ret = 0;
		for(int i = 0; i < s.size(); i++) {
			ret += s.get(i) * switchInput[i];
		}
		if((ret % 2) == p) {
			return 1;
		}else {
			return 0;
		}
	}

	void output() {
		System.out.println("No: " + this.no);
		System.out.println("s: " + s);
		System.out.println("p: " + this.p);
	}

}