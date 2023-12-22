import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int min = 0;
        int max = n;
        while(max - min > 1) {
        	int mid = (max + min) / 2 ;
        	if(check(s, mid)) {
        		min = mid;
        	} else {
        		max = mid;
        	}
        }

        int ans = min;
        if(check(s, max)) {
        	ans = max;
        }
        System.out.println(ans);
	}

	private static boolean check(String s, int mid) {
		for(int i = 0; i < s.length() / 2 ; i++) {
			String tmp = s.substring(i, i + mid);
			String remain = s.substring(i + mid);
			if(remain.contains(tmp)) {
				return true;
			}
		}
		return false;
	}
}