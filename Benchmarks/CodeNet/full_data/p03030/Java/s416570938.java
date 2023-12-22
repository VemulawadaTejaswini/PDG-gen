import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<Integer>> map = new TreeMap<>();
		int N = sc.nextInt();
		String[] check = new String[N];
		for(int i = 1; i<=N;i++) {
			check[i-1] = sc.next() + " " + (100-sc.nextInt() + " " + i);
		}
		Arrays.sort(check);
		for(String st : check) {
			String s = st.split(" ")[2];
			System.out.println(s);
		}
	}
}
