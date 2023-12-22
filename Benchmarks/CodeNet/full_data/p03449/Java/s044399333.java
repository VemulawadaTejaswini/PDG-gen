import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[2][n];
    for(int i = 0; i < n; i++) {
    	a[0][i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
    	a[1][i] = sc.nextInt();
    }
    int x = 0;
    int y = 0;
    int max = 0;
    for(int i = 0; i < n; i++) {
    	x += a[0][i];
    	for(int j = i; j < n; j++) {
    		y += a[1][j];
    	}
    	if(max < x + y) {
    		max = x + y;
    	}
    	y = 0;
    }
    System.out.println(max);
}
}