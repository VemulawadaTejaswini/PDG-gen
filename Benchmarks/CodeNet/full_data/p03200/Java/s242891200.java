import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s;
		int a = 0;
		int kaisu = 0;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		List<String> hoge = new ArrayList<String>();	//名前

		for(int i=0;i<s.length();i++)hoge.add(String.valueOf(s.charAt(i)));
		//System.out.println(hoge);
		for(int i=0;i<s.length()-1;i++) {	//1回目
			if(hoge.get(i).equals("B") && hoge.get(i+1).equals("W")) {
				a++;
				kaisu++;
				hoge.set(i, "W");
				hoge.set(i+1, "B");
			}
		}

		while(a!=0) {
			a = 0;
			for(int i=0;i<s.length()-1;i++) {
				if(hoge.get(i).equals("B") && hoge.get(i+1).equals("W")) {
					a++;
					kaisu++;
					hoge.set(i, "W");
					hoge.set(i+1, "B");
				}
			}
		}
		System.out.println(kaisu);
	}
}
