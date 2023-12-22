
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				Pair pair = new Pair();
				pair.setX(A[i]);
				pair.setY(A[j]);
				pair.setValue(A[i] + A[j]);
				pairs.add(pair);
				Collections.sort(pairs, (p1,p2)->p1.getValue()-p2.getValue());
				if(pairs.size()>M) {
					pairs.remove(0);
				}
			}
		}
		
		
		int total = 0;
		for (int i = 0; i < M; i++) {
				total += pairs.get(i).getValue();
		}
		System.out.println(total);
	}

}
class Pair {
	private int x;
	private int y;
	private int value;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
