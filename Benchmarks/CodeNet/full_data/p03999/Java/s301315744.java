import java.util.*;

public class Main {
    static long total = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		calc(1, 0, arr[0] - '0', arr);
		System.out.println(total);
	}
	
	static void calc(int idx, long sum, long add, char[] arr) {
	    if (idx == arr.length) {
	        total += sum + add;
	        return;
	    }
	    int x = arr[idx] - '0';
	    calc(idx + 1, sum + add, x, arr);
	    calc(idx + 1, sum, add * 10 + x, arr);
	}
}
