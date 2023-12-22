import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	static List<String> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String P = sc.nextLine().replaceAll(" ", "");
		String Q = sc.nextLine().replaceAll(" ", "");
		String first ="";
		if(P.equals(Q)) {
			System.out.println(0);
			return;
		}
		for(int i=1; i<=N;i++) {
			first += i;
		}
		list = new ArrayList();
		permutation(first, "");
		int p = list.indexOf(P);
		int q = list.indexOf(Q);
		System.out.println(Math.abs(p-q));
	}

	public static void permutation(String  s, String ans) {
		if(s.length() <= 1) {
			list.add(ans+s);
		} else {
			for(int i=0; i< s.length(); i++) {
				permutation(s.substring(0, i)+ s.substring(i + 1), ans + s.charAt(i));
			}
		}
	}
}