import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = sc.nextInt();
		//list.addAll(Arrays.asList(sc.nextLine()));
		for(int k = 1;k <= a; k++) {
			int j = sc.nextInt();
			list.add(j);
		}
		int count = 0;
		for (int i = 1; i < list.size()-1;i++) {
				if (list.get(i-1) < list.get(i) && list.get(i) < list.get(i+1) || list.get(i-1) > list.get(i) && list.get(i) > list.get(i+1)) {
					count++;
				}
		}
		System.out.println(count);
	}
}