import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    void solve() {
		char[] s = in.nextLine().toCharArray(), t = in.nextLine().toCharArray();
		for(int i = 0; i < s.length - t.length + 1; i++){
			boolean f = true;
			for(int j = 0; j < t.length; j++){
				if(s[i + j] != '?' && t[j] != '?' && s[i + j] != t[j]){
					f = false;
				}
			}
			if(f){
				for(int j = 0; j < t.length; j++){
					s[i + j] = t[j];
				}
				for(int j = 0; j < s.length; j++){
					System.out.print(s[j] == '?' ? 'a' : s[j]);
				}
				System.out.println();
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
	
    public static void main(String[] args) {
		new Main().solve();
    }
}
