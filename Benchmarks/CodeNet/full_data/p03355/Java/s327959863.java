import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int len = s.length();
		int k = in.nextInt();
        SortedSet<String> set = new TreeSet<>();
        for(int i=0; i<len; i++) {
            for(int j=i; j<len; j++) {
                set.add(s.substring(i, j+1));
            }
        }
        String[] arr = set.toArray(new String[0]);
        System.out.println(arr[k-1]);
	}
}
