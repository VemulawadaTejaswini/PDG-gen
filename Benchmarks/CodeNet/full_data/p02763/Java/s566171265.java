import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int Q = sc.nextInt();
		TreeSet<Integer>[] t = new TreeSet[26];
		for(int i = 0; i < 26; i++)
			t[i] = new TreeSet<Integer>();
		for(int i = 0; i < N; i++)
			t[S.charAt(i)-'a'].add(i);
		for(int i = 0; i < Q; i++){
			if(sc.nextInt() == 1) {
				int q = sc.nextInt()-1;
				for(int j = 0; j < 26; j++)
					if(t[j].contains(q))
						t[j].remove(q);
				t[sc.next().charAt(0)-'a'].add(q);
			}
			else {
				int ans = 0;			
				int l =  sc.nextInt()-1, r = sc.nextInt()-1;
				for(char j = 0; j < 26; j++) {
					if(t[j].size() == 0)
						continue;
					else if(t[j].last() >= l && t[j].first() <= r)
						ans++;
				}
				System.out.println(ans);
			}
		}

	}

}