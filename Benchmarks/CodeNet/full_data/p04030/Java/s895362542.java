import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		String answer = "";
		
		for(int i = 0; i < param.get(0).length(); i++){
			if(param.get(0).charAt(i) == '0'){
				answer+= 0;
			} else if(param.get(0).charAt(i) == '1'){
				answer+= 1;
			} else {
				if(answer.length() != 0) answer = answer.substring(0, answer.length()-1);
			}
		}
		System.out.println(answer);
	}
}