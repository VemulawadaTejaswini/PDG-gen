import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
    public void solve() {
    	int H = Integer.parseInt(sc.next());
    	int W = Integer.parseInt(sc.next());
    	int[][] A = new int[H][W];
    	for (int i = 0; i < H; i++) {
    		for (int j = 0; j < W; j++) {
    			A[i][j] = Integer.parseInt(sc.next());
    		}
		}
    	int N = 0;
    	boolean f = true;
    	List<PP> hist = new ArrayList<>();
    	for (int i = 0; i < H; i++) {
			if(f) {
				for (int j = 0; j < W; j++) {
					if(A[i][j] % 2 == 1) {
						if(j != W-1) {
							N++;
							A[i][j+1]++;
							hist.add(new PP(i,j,i,j+1));
						} else if(i != H-1) {
							N++;
							A[i+1][j]++;
							hist.add(new PP(i,j,i+1,j));
						}
					}
				}
			} else {
				for( int j = W-1; j >= 0; j--) {
					if(A[i][j] % 2 == 1) {
						if(j != 0) {
							N++;
							A[i][j-1]++;
							hist.add(new PP(i,j,i,j-1));
						} else if(i != H-1) {
							N++;
							A[i+1][j]++;
							hist.add(new PP(i,j,i+1,j));
						}
					}
				}
			}
			f = !f;
		}
    	out.println(N);
    	for (PP p : hist) {
			out.println((p.y1+1) + " " + (p.x1+1) + " " + (p.y2+1) + " " + (p.x2+1));
		}
    }
    class PP {
    	int y1, x1, y2, x2;
    	public PP(int y1, int x1, int y2, int x2) {
    		this.y1 = y1;
    		this.x1 = x1;
    		this.y2 = y2;
    		this.x2 = x2;
    	}
    }
}
