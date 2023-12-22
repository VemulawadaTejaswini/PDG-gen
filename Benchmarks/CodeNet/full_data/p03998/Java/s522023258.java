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
		int turn = 0;
		char target = 'a';

		while(true){
			if(param.get(turn).length() == 0) break;
			target = param.get(turn).charAt(0);
			param.set(turn,param.get(turn).substring(1));
			
			if(target == 'a'){
				turn = 0;
			}else if(target == 'b'){
				turn = 1;
			}else if(target == 'c'){
				turn = 2;
			}
		}
		System.out.println(Character.toUpperCase(target));
	}
}