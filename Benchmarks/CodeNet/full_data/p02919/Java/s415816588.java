import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int ans = 0;

		for(int i = 0;i<n;i++){
			a[i] = sc.nextInt();
		}
		sc.close();

		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<n;i++){
			list.add(a[i]);
			for(int j = i +1;j<n;j++){
				list.add(a[j]);
				Collections.sort(list);
				ans += list.get(list.size()-2);
			}
			list.clear();
		}
System.out.println(ans);
	}
}
