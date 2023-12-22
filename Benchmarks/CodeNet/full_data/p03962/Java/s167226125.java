import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int ans = 3;
		
		if(a == b) {
			ans--;
		}else if(a == c){
			ans--;
		}else if(b == c){
			ans--;
		}
		
		if(ans == 0) {
			System.out.println(1);
		}else {
			System.out.println(ans);
		}
	}
}
