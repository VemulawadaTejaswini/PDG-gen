
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			a.put(i+1, sc.nextInt());
		}
		sc.close();
		for(int i = 0; i < n; i++) {
			for(Entry<Integer,Integer> entry:a.entrySet()) {
				if(entry.getValue()==i+1) {
					System.out.print(entry.getKey()+" ");
				}
			}
		}
		System.out.println();
	}

}
