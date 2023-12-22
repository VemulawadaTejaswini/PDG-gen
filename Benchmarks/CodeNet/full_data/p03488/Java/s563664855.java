import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length()+1;
		char[] s = new char[N];
		for(int i = 0; i < N-1; i++)
			s[i] = S.charAt(i);
		s[N-1] = 'T';
		int x = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> h = new ArrayList<>();
		List<Integer> v = new ArrayList<>();
		boolean ish = true;
		int temp = 0;
		int st = 0;
		for(int i = 0; i < N; i++)
			if(s[i] == 'T') {
				st = i;
				x -= i;
				break;
			}
		for(int i = st; i < N; i++) {
			if(s[i] == 'F')
				temp++;
			else {
				if(ish) {
					h.add(temp);
					ish = false;
				}
				else {
					v.add(temp);
					ish = true;
				}
				temp = 0;
			}
		}
		int max = 16001;
		int[][] dph = new int[h.size()+1][max];
		dph[0][8000] = 1;
		for(int i = 0; i < h.size(); i++) {
			for(int j = 0; j < max; j++) {
				if(h.get(i)+j < max)
					dph[i+1][h.get(i)+j] = Math.max(dph[i+1][h.get(i)+j], dph[i][j]);
				if(j-h.get(i) >= 0)
					dph[i+1][j-h.get(i)] = Math.max(dph[i+1][j-h.get(i)], dph[i][j]);
			}
		}
		int[][] dpv = new int[v.size()+1][max];
		dpv[0][8000] = 1;
		for(int i = 0; i < v.size(); i++) {
			for(int j = 0; j < max; j++) {
				if(v.get(i)+j < max)
					dpv[i+1][v.get(i)+j] = Math.max(dpv[i+1][v.get(i)+j], dpv[i][j]);
				if(j-v.get(i) >= 0)
					dpv[i+1][j-v.get(i)] = Math.max(dpv[i+1][j-v.get(i)], dpv[i][j]);
			}
		}
		if(dph[h.size()][8000+x] == 1 && dpv[v.size()][8000+y] == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
