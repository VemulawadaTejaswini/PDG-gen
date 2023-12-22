import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] [] d = new int [n][2];
        for(int i = 0; i < n; i++) {
        	d[i][0] = sc.nextInt();
        	d[i][1] = sc.nextInt();
        }

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(0);
        q1.add(0);
        for(int i = 0; i < n; i++) {
        	Queue<Integer> q2 = new LinkedList<>();
        	while(!q1.isEmpty()) {
        		int x = q1.poll();
        		int y = q1.poll();
        		q2.add(x);
        		q2.add(y);
        		q2.add(x+d[i][0]);
        		q2.add(y+d[i][1]);
        	}
        	q1 = q2;
        }

        double ans = 0;
        while(!q1.isEmpty()) {
        	long x = q1.poll();
    		long y = q1.poll();
        	double tmp = Math.sqrt(x*x + y*y);
        	ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
	}
}