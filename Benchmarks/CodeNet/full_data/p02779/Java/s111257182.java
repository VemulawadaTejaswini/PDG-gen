import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<Long>(Arrays.asList(0l));
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			long l = sc.nextLong();
			if(!list.contains(l)) {
				list.add(l);
			}
		}
		if(list.size() == N+1)System.out.println("Yes");
		else System.out.println("No");
	}
}