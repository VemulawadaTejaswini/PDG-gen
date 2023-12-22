import java.util.HashSet;
import java.util.Scanner;
 
class Main {
	int N;
	String[] s;
	int M;
	String[] t;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		N = sc.nextInt();
		s = new String[N];
		for(int i=0;i<N;i++){
			s[i] = sc.next();
		}
		M = sc.nextInt();
		t = new String[M];
		for(int i=0;i<M;i++){
			t[i] = sc.next();
		}
	}
	void solve(){
		HashSet<String> h = new HashSet<String>(N+M);
		for(int i=0;i<N;i++) h.add(s[i]);
		for(int i=0;i<M;i++) h.add(t[i]);
		int max = 0;
		for(String str:h){
			int cnt = 0;
			for(int i=0;i<N;i++) if(str.equals(s[i])) cnt++;
			for(int i=0;i<M;i++) if(str.equals(t[i])) cnt--;			
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}