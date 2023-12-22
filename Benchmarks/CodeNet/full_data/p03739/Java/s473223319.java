import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        long[] map = new long[N];
        for (int i = 0; i < N; i++) {
        	map[i] = sc.nextLong();
        }
        
        long ans1 = 0;
        long ai = map[0];
        if (map[0] < 0) {
        	ans1 += Math.abs(map[0] - 1);
        	ai = 1;
        }
        for (int i = 1; i < N; i++) {
        	long a = map[i];
        	long total = ai + a;
        	if (ai > 0) {
        		if (total < 0) {
        			ai = total;
        			continue;
        		} else {
        			long tmp = total + 1;
        			ans1 += Math.abs(tmp);
        			ai = -1;
        		}
        	} else if(ai < 0) {
        		if (total > 0) {
        			ai = total;
        			continue;
        		} else {
        			long tmp = total - 1;
        			ans1 += Math.abs(tmp);
        			ai = 1;
        		}
        	}
        }
        
        long ans2 = 0;
        if (map[0] > 0) {
        	ans2 += Math.abs(map[0] + 1);
        	ai = -1;
        }
        for (int i = 1; i < N; i++) {
        	long a = map[i];
        	long total = ai + a;
        	if (ai > 0) {
        		if (total < 0) {
        			ai = total;
        			continue;
        		} else {
        			long tmp = total + 1;
        			ans2 += Math.abs(tmp);
        			ai = -1;
        		}
        	} else if(ai < 0) {
        		if (total > 0) {
        			ai = total;
        			continue;
        		} else {
        			long tmp = total - 1;
        			ans2 += Math.abs(tmp);
        			ai = 1;
        		}
        	}
        }
        
        System.out.println(Math.min(ans1, ans2));
    }
}	