import java.util.Scanner;
 
class Main {
	String s;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		s = sc.next();
	}
	void solve(){
		boolean[] c = new boolean[26];
		for(int i=0;i<s.length();i++){
			c[s.charAt(i)-'a'] = true;
		}
		for(int i=0;i<26;i++){
			if(!c[i]) {
				System.out.printf("%c\n",('a'+i));
				break;
			} else if(i==25){
				System.out.println("None");
			}
		}
	}
}