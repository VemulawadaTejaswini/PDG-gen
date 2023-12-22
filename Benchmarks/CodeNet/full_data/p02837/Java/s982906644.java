import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==================================================================
    Map<Integer, List<PP>> map = new HashMap<>();
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	int a, x, y;
    	List<PP> list;
    	for (int i = 0; i < N; i++) {
        	a = Integer.parseInt(sc.next());
        	list = new ArrayList<>();
        	map.put(i, list);
        	for (int j = 0; j < a; j++) {
            	x = Integer.parseInt(sc.next()) - 1;
            	y = Integer.parseInt(sc.next());
				list.add(new PP(x, y));
			}
		}
    	int[] J = new int[N];
    	int ans = 0, cnt;
    	for (int i = (1 << N) - 1; i >= 0; i--) {
    		cnt = 0;
    		Arrays.fill(J, -1);
    		LOOP:
			for (int j = 0; j < N; j++) {
				if((i & (1 << j)) == 0)		continue;	// 無視する
				for(PP p : map.get(j)) {
					if(J[p.key] == -1)		J[p.key] = p.val;
					else if(J[p.key] != p.val) {
						cnt = -1;
						break LOOP;
					}
					if(p.val == 0) {
						if((i & (1 << p.key)) == 1) {
							cnt = -1;
							break LOOP;
						}
					}
					if(p.val == 1) {
						if((i & (1 << p.key)) != 1) {
							cnt = -1;
							break LOOP;
						}
					}
				}
				cnt++;
			}
    		ans = Math.max(ans, cnt);
		}
    	out.println(ans);
    }    
    // Set に入れるなら　PPKEY　を使う！
    class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
    }
    // ==================================================================
}

