import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++){
        	a.add(Integer.parseInt(sc.next()));
        }

        int sign = 1;
        int ans1 = 0;
        int sum1 = 0;

        for (int i = 0; i < n; i++) {
        	sum1 += a.get(i);
        	if (sum1 * sign <= 0){
        		ans1 += Math.abs(sum1) + 1;
        		sum1 = sign;
        	}
        	sign *= -1;
		}

        sign = -1;
        int ans2 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
        	sum2 += a.get(i);
        	if (sum2 * sign <= 0){
        		ans2 += Math.abs(sum2) + 1;
        		sum2 = sign;
        	}
        	sign *= -1;
		}

        System.out.println(Math.min(ans1, ans2));
    }
}