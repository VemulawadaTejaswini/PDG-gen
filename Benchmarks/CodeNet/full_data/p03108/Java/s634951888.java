import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private class Way {
		public int a = 0;
		public int b = 0;
		
		public Way(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	
	private LinkedList<HashSet<Integer>> setList = new LinkedList<HashSet<Integer>>();
	
	private long countConnect(int[] connect, int target) {
		long count = 0;
		for (int i=0; i<connect.length; i++) {
			if (connect[i] == target) {
				count++;
			}
		}
		return count;
	}
	
	private long changeConnect(int[] connect, int from, int to) {
		long count = 0;

		for (int i=0; i<connect.length; i++) {
			if (connect[i] == from) {
				connect[i] = to;
				count++;
			}
		}
		return count;
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		/*
		for (int i=0; i<N; i++) {
			HashSet<Integer> island = new HashSet<Integer>();
			island.add(i+1);
			setList.add(island);
		}
		*/

		LinkedList<Way> ways = new LinkedList<Main.Way>();
		for (int i=0; i<M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			ways.addFirst(new Way(a, b));
		}
		in.close();
		
		LinkedList<Long> results = new LinkedList<Long>();
		long nowResult = (long)N * (long)(N-1) / 2;
		results.addFirst(nowResult);

		int[] connect = new int[N];
		for (int i=0; i<N; i++) {
			connect[i] = i;
		}
		for (Way way : ways) {
			if (connect[way.a-1] == connect[way.b-1]) {
				results.addFirst(nowResult);
				continue;
			} else {
				int aType = connect[way.a-1];
				int bType = connect[way.b-1];
				
				long countA = countConnect(connect, aType);
				long countB = changeConnect(connect, bType, aType);
				
				nowResult -= countA * countB;
				results.addFirst(nowResult);
			}
		}
		
		/*
		for (Way way : ways) {
			ListIterator<HashSet<Integer>> it = setList.listIterator();

			HashSet<Integer> foundFirst = null;
			HashSet<Integer> foundA = null;
			HashSet<Integer> foundB = null;
			while (it.hasNext()) {
				HashSet<Integer> set = it.next();
				if (foundA == null && set.contains(way.a)) {
					foundA = set;
					if (foundFirst == null) {
						foundFirst = set;
					}
				}
				if (foundB == null && set.contains(way.b)) {
					foundB = set;
					if (foundFirst == null) {
						foundFirst = set;
					}
				}
				
				if (foundA != null && foundB != null) {
					if (foundA != foundB) {
						nowResult -= (long)foundA.size() * foundB.size();
						foundFirst.addAll(set);
						it.remove();
					}
					break;
				}
			}
			results.addFirst(nowResult);
		}

		*/
		
		results.removeFirst();
		for (Long result : results) {
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
