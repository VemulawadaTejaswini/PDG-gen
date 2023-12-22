import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<Long>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		for(int i=0; i<n; i++) {
			list.add(in.nextLong());
		}
		ArrayList<Long> mul = new ArrayList<Long>();
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				//if(i==j) continue;
				mul.add(list.get(i) * list.get(j));
			}
		}
		Collections.sort(mul);
		System.out.println(mul.get(k-1));
	}
}
