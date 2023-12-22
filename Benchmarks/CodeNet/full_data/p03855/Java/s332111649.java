import java.io.*;
import java.util.*;

public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCities = sc.nextInt();
		int numRoads = sc.nextInt();
		int numRails = sc.nextInt();
		//roads[i] = set that road i belongs to
		Hashtable<Integer, Set<Integer>> roads = new Hashtable<Integer, Set<Integer>>();
		Hashtable<Integer, Set<Integer>> rails = new Hashtable<Integer, Set<Integer>>();
		for(int i = 0; i < numRoads; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(roads.get(p) != null && roads.get(q) != null) {
				roads.get(p).addAll(roads.get(q));
				for(Integer ind : roads.get(q)) {
					roads.put(ind, roads.get(p));
				}
			}
			else if(roads.get(q) != null) {
				roads.get(q).add(p);
				roads.put(p, roads.get(q));
			}
			else if(roads.get(p) != null) {
				roads.get(p).add(q);
				roads.put(q, roads.get(p));
			}
			else {
				Set<Integer> newset = new HashSet<Integer>();
				newset.add(p);
				newset.add(q);
				roads.put(p, newset);
				roads.put(q, newset);
			}
		}
		for(int i = 0; i < numRails; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(rails.get(p) != null && rails.get(q) != null) {
				rails.get(p).addAll(rails.get(q));
				for(Integer ind : rails.get(q)) {
					rails.put(ind, rails.get(p));
				}
			}
			else if(rails.get(q) != null) {
				rails.get(q).add(p);
				rails.put(p, rails.get(q));
			}
			else if(rails.get(p) != null) {
				rails.get(p).add(q);
				rails.put(q, rails.get(p));
			}
			else {
				Set<Integer> newset = new HashSet<Integer>();
				newset.add(p);
				newset.add(q);
				rails.put(p, newset);
				rails.put(q, newset);
			}
		}
		for(int i = 1; i <= numCities; i++) {
			Set<Integer> temp = new HashSet<Integer>();
			temp.add(i);
			Set<Integer> intersection = new HashSet<Integer>(roads.getOrDefault(i, temp));
			intersection.retainAll(rails.getOrDefault(i, temp));
			System.out.println(intersection.size());
		}
	}
}