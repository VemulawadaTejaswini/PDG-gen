import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		int total = 0;
		int answer = 0;

		for(int i = 1; i <= num.get(0); i++){
			total += num.get(i);
		}

		for(int i = 0; i < (num.get(0)+1 + num.get(num.get(0)+1)+1)/2+1; i+=2){
			answer = total - num.get(num.get(num.get(0)+2+i));
			answer = answer + num.get(num.get(0)+3+i);
			System.out.println(answer);
		}
	}
}