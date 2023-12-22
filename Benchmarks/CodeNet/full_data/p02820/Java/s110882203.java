import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),K = sc.nextInt();
		int R = sc.nextInt(),S = sc.nextInt(),P = sc.nextInt() ;
		String str = sc.next();
		String[] list = str.split(",");
		ArrayList<String> ch = new ArrayList<>();
		for(String s : list) ch.add(s);
		ch = check(ch,K);
		
		for(int i = 0; i < ch.size(); i++) {
			if(ch.get(i) == "r") {
				ans += P;
			}else if(ch.get(i) == "s") {
				ans += R;
			}else if(ch.get(i) == "p") {
				ans += S;
			}
		}
		System.out.println(ans);
	}
	public static ArrayList<String> check(ArrayList<String> list, int k) {
		for(int i = k; i < list.size(); i++) {
			if(list.get(i) == list.get(i-k)) {
				list.set(i, "n");
			}
		}
		return list;
	}
}