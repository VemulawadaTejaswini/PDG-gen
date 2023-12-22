import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Long> list = new ArrayList<>();
		
		long Count = 0l;
		
		
		for(int i = 0; i < N; i++) {
			long ch = sc.nextLong();
			list.add(ch);
			Collections.sort(list);
			if(ch <= list.get(0))Count++;
		}
		System.out.println(Count);
	}
}