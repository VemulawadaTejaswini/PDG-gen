import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		char[] s = sc.next().toCharArray();
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> forA = new ArrayList<String>();
		forA.add("L");

		ArrayList<String> forB = new ArrayList<String>();
		forA.add("R");

		for(int i = 0; i < s.length;  i++){
			if(i % 2==0){
				a.add(String.valueOf(s[i]));
			}else{
				b.add(String.valueOf(s[i]));
			}
		}

		if(!a.containsAll(forA) && !b.containsAll(forB)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		sc.close();
	}
}
