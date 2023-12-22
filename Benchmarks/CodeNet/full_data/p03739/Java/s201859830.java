import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> aArrayList = new ArrayList<>();

        for (int i=0; i<n; i++) {
        	aArrayList.add(Integer.parseInt(sc.next()));
		}

        int sign = 1;
        int ans1 = 0;
        int sum1 = 0;
        for (Integer a : aArrayList) {
        	if (sign > 0){
        		int d = Math.max(sign-(sum1+a), 0);
        		ans1 += d;
        		sum1 += d + a;
        	}else {
        		int d = Math.min(sign-(sum1+a), 0);
        		ans1 -= d;
        		sum1 += d + a;
        	}
        	sign *= -1;
		}

        sign = -1;
        int ans2 = 0;
        int sum2 = 0;
        for (Integer a : aArrayList) {
        	if (sign > 0){
        		int d = Math.max(sign-(sum2+a), 0);
        		ans2 += d;
        		sum2 += d + a;
        	}else {
        		int d = Math.min(sign-(sum2+a), 0);
        		ans2 -= d;
        		sum2 += d + a;
        	}
        	sign *= -1;
		}
        System.out.println(Math.min(ans1, ans2));
    }
}
