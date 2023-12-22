import java.io.File;
import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		UnionFind road = new UnionFind(N);
		UnionFind train = new UnionFind(N);
		int K = sc.nextInt();
		int L = sc.nextInt();
		for(int i = 0; i < K; i++){
			int p = sc.nextInt() - 1;
			int q = sc.nextInt() - 1;
			road.unite(p, q);
		}
		for(int i = 0; i < L; i++){
			int r = sc.nextInt() - 1;
			int s = sc.nextInt() - 1;
			train.unite(r, s);
		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < N; i++){
			String p = String.format("%06d%06d", road.find(i), train.find(i));
			Integer count = map.get(p);
			if(count == null) map.put(p, 1);
			else map.put(p, count+1);
		}
		
		for(int i = 0; i < N; i++){
			String p = String.format("%06d%06d", road.find(i), train.find(i));
			System.out.print(map.get(p));
			if(i == N - 1) System.out.println();
			else System.out.print(" ");
		}
	}
}

class UnionFind{
	int[] par;
	int[] rank;
	int group;
	UnionFind(int n){
		par = new int[n];
		rank = new int[n];
		group = n;
		for(int i = 0; i < n; i++){
			par[i] = i;
			rank[i] = 0;
		}
	}
	int find(int x){
		if(par[x] == x) return x;
		return par[x] = find(par[x]);
	}
	void unite(int x, int y){
		x = find(x);
		y = find(y);
		if(x == y) return;
		group--;
		if(rank[x] > rank[y]) par[x] = y;
		else{
			par[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
		}
	}
	boolean same(int x, int y){
		return find(x) == find(y);
	}
}