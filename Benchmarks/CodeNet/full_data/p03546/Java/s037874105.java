import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int h = scanner.nextInt();
	    int w = scanner.nextInt();
	    int c[][] = new int[10][10];
	    for (int i = 0; i < 10; i++) {
	    	for (int j = 0; j < 10; j++) {
	    		c[i][j] = scanner.nextInt();
	    	}
	    }
	    calcCost(c);
	    int total = 0;
	    for (int i = 0; i < h*w; i++) {
	    	int a = scanner.nextInt();
	    	if (a == -1 || a == 1) {
	    		continue;
	    	}
	    	total = total + c[a][1];
	    }
	    System.out.println(total);
	}
	
	private static void calcCost(int[][] c) {
		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
				}
			}
		}
	}

}
