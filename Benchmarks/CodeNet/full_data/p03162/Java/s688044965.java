import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(n, arr));
    }

    private static int solve(int day, int[][] input) {
        int[] a = new int[input.length];
        int[] b = new int[input.length];
        int[] c = new int[input.length];
      
      	a[0] = input[0][0];
      	b[0] = input[0][1];
      	c[0] = input[0][2];
      
      	for (int i = 1; i < input.length; i++) {
        	a[i] = input[i][0] + Math.max(b[i - 1], c[i - 1]);
          	b[i] = input[i][1] + Math.max(a[i - 1], c[i - 1]);
          	c[i] = input[i][2] + Math.max(a[i - 1], b[i - 1]);
        }
      	return Math.max(a[input.length - 1], Math.max(b[input.length - 1], c[input.length - 1]));
    }
}
