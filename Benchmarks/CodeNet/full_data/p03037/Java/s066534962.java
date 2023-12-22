import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] gatestart = new int[M];
        int[] gateend = new int[M];
        
        for (int i = 0; i < M; i++) {
        	gatestart[i] = sc.nextInt();
        	gateend[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 1; i <= N; i++) {
        	boolean check = true;
        	for (int j = 0; j < M; j++) {
        		if (i >= gatestart[j] && i <= gateend[j]) {
        			
        		} else {
        			check = false;
        		}
        	}
        	if (check) {
        		count++;
        	}
        }
        System.out.println(count);
    }

}
