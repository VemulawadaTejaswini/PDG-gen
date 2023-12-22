import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		
		int[] w = new int[W];
		int[] h = new int[H];
		
		ArrayList<Integer> wlist = new ArrayList<>();
		ArrayList<Integer> hlist = new ArrayList<>();
		for (int i = 0; i < w.length; i++) {
			w[i] = scanner.nextInt();
			if (i != 0)
				wlist.add(w[i]);
		}
		
		for (int i = 0; i < h.length; i++) {
			h[i] = scanner.nextInt();
			if (i != 0)
				hlist.add(h[i]);
		}
		
		long cost = 0;
		cost += Math.max(h[0], w[0]) +  Math.min(h[0], w[0]) * 2;
		
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < 1; j++) {
				if (i != 0 && j == 0) {
					if (w[i] < h[0]) {
						cost += w[i] * 2;
					} else {
						cost += w[i] + h[0];
					}
				} 

			}
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < h.length; j++) {
				if (i == 0 && j != 0) {
					if (w[0] < h[j]) {
						cost += w[0] + h[j];
					} else {
						cost += h[j] * 2; 
					}
				} 
			}
		}
		
		Collections.sort(hlist);
		ArrayList<Integer> SumAdder = new ArrayList<Integer>();
		for (int i = 0; i < hlist.size(); i++) {
			if (i == 0)
				SumAdder.add(hlist.get(0));
			else 
				SumAdder.add(SumAdder.get(i - 1) + hlist.get(i));
		}

		
		for (int i = 0; i < wlist.size(); i++) {
			int t = wlist.get(i);
			int index = Collections.binarySearch(hlist, t);
			if (index < 0) {
				index = -index - 1;
			} 
			
			if (index + 2 < hlist.size() - 1)
				index += 2;
			else 
				index = hlist.size() - 1;
			
			while (index >= 0 && hlist.get(index) > t)
				index --;
			
			
			if (index < 0)
				cost += (hlist.size()) * t;
			else
				cost += SumAdder.get(index) + (hlist.size() - 1 - index) * t;
		}
		
		
		System.out.println(cost);
		
	}

}