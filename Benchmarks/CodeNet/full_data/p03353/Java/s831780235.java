import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt();
		List<String> list = new ArrayList<>();
		int n = s.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				list.add(s.substring(i, j));
			}
		}
		list.sort(Comparator.naturalOrder());
		int count = 1;
		int idx = 1;
		String substring = list.get(0);
		while(count<k) {
			if(substring.equals(list.get(idx))) {
				idx++;
			}else {
				substring = list.get(idx++);
				count++;
			}
		}
		System.out.println(substring);
		in.close();
	}

}
