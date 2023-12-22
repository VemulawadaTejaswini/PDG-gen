
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int T = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
        	int cost = sc.nextInt();
        	int time = sc.nextInt();
        	if (T >= time) {
        		min = Math.min(min, cost);
        	}
        }
        
        System.out.println(min == Integer.MAX_VALUE ? "TLE" : min);
    }
}


