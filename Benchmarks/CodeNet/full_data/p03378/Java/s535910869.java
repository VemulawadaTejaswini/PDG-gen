import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int [] cost = new int [n+1];
        for(int i = 0; i < m; i++) {
        	cost[sc.nextInt()]++;
        }
        int left = cost(cost,0,x);
        int right = cost(cost,x,n);
        System.out.println(Math.min(left,right));
    }

    static int cost(int[]cost,int start, int end) {
    	int r = 0;
    	for(int i = start; i <= end; i++) {
    		r += cost[i];
        }
    	return r;
    }
}