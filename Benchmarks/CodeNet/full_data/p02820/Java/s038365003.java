import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
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
//        solver.test();
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
    //================================================================================
    int N, K, R, S, P;
    char[] C;
    char[] rec = new char[100010];
    public void solve() {
    	N = Integer.parseInt(sc.next());
    	K = Integer.parseInt(sc.next());
    	R = Integer.parseInt(sc.next());
    	S = Integer.parseInt(sc.next());
    	P = Integer.parseInt(sc.next());
    	C = sc.next().toCharArray();
    	long ans = 0;
    	int cnt;
    	for (int i = 0; i < N; i++) {
    		cnt = i - K;
			if(cnt >= 0) {
				if(C[i] == 'r') {
					if(rec[cnt] != 'p') {
						rec[i] = 'p';
						ans += P;
					}
				} else if(C[i] == 's') {
					if(rec[cnt] != 'r') {
						rec[i] = 'r';
						ans += R;
					}
				} else if(C[i] == 'p') {
					if(rec[cnt] != 's') {
						rec[i] = 's';
						ans += S;
					}
				}
			} else {
				if(C[i] == 'r') {
					rec[i] = 'p';
					ans += P;
				} else if(C[i] == 's') {
					rec[i] = 'r';
					ans += R;
				} else if(C[i] == 'p') {
					rec[i] = 's';
					ans += S;
				}
			}
		}
    	out.println(ans);
    }
}