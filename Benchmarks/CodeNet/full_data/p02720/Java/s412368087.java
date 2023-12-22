import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		int i = 0;
		while(list.size() < k) {
			int x = list.get(i);
			if (x % 10 != 0) list.add((10*x) + (x % 10) - 1);
			list.add((10*x) + (x % 10));
			if (x % 10 != 9) list.add((10*x) + (x % 10) + 1);
			i++;
		}
		
		
		System.out.println(list.get(k-1));
	}
}