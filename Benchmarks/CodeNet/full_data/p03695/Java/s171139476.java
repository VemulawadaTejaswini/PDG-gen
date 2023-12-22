import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[8];
		int over = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    boolean flag = true;
		    for (int j = 1; j <=8; j++) {
		        if (x < j * 400) {
		            counts[j - 1]++;
		            flag = false;
		            break;
		        }
		    }
		    if (flag) {
		        over++;
		    }
		}
		int types = 0;
		for (int i = 0; i < counts.length; i++) {
		    if (counts[i] != 0) {
		        types++;
		    }
		}
		int max = Math.min(types + over, 8);
		int min = Math.max(types, 1);
		System.out.println(min + " " + max);
	}
}
