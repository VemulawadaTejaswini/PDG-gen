import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		char[] charSet = scanner.nextLine().toCharArray();
		int len = charSet.length;

		List<Character> zeroStart = new ArrayList<Character>();
		List<Character> oneStart = new ArrayList<Character>();
		int zcnt = 0;
		int ocnt = 0;
		for(int i = 0; i < len; i++){
			zeroStart.add(Integer.toString(i%2).toCharArray()[0]);
			oneStart.add(Integer.toString((i+1)%2).toCharArray()[0]);

			if(!zeroStart.get(i).equals(charSet[i])){
				zcnt++;
			}else{
				ocnt++;
			}
		}
		int min = Math.min(zcnt, ocnt);


		System.out.println(min);
		scanner.close();
	}

}
