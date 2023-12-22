import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

    	TreeSet[] segs = new TreeSet[26];
    	char[] d = sc.next().toCharArray();
    	for (int i = 0; i < 26; i++){
    		segs[i] = new TreeSet();
    		segs[i].add(510000);
    	}
    	for (int i = 0; i < n; i++) {
    		segs[(int) d[i] - 'a'].add(i);
    	}
    	int q = sc.nextInt();
    	for (int i = 0; i < q; i++) {
    		int a = sc.nextInt();
    		if (a==1) {
    			int index = sc.nextInt()-1;
    			char oldc = d[index];
    			char newc = sc.next().toCharArray()[0];
    			if (oldc == newc) continue;
    			d[index]=newc;
    			segs[(int)oldc-'a'].remove(index);
    			segs[(int)newc-'a'].add(index);
    			continue;
    		}
            int l = scan.nextInt()-1;
            int r = scan.nextInt()-1;
            int ans = 0;
            for (int j = 0; j < 26; j++) {
                if (segs[j].ceiling(l) <= r) ans += 1;
            }
            System.out.println(ans);
    	}
    }
} 
