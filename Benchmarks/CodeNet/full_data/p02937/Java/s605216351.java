import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		long n = s.length;
		char[] t = br.readLine().toCharArray();
		TreeSet<Long>[] poss = new TreeSet[26];
		for(int c = 0; c < 26; c++){
			poss[c] = new TreeSet<>();
		}
		for(int i = 0; i < n; i++){
			poss[s[i]-'a'].add((long)i);
		}
		long res = -1;
		long count = 0;
		for(char c: t){
			if(poss[c-'a'].isEmpty()){
				System.out.println("-1"); return;
			}
			Long ind = poss[c-'a'].higher(res % n);
			if(ind == null){
				ind = poss[c-'a'].first();
				count++;
				res = count * n + ind;
			}
			else{
				res = count * n + ind;
			}
		}
		System.out.println(res+1);
	}

}
