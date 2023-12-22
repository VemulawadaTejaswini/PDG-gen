import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
      	int[][] red = new int[n][n];
        int[][] blue = new int[n][n];
      
      	for (int i = 0; i < n; i++) {
          red[i][0] = sc.nextInt();
          red[i][1] = sc.nextInt();
        }
      
        for (int i = 0; i < n; i++) {
          blue[i][0] = sc.nextInt();
          blue[i][1] = sc.nextInt();
        }
        
      Arrays.sort(red, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o2[0] - o1[0];
            }
        }
    });
      
     Arrays.sort(blue, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        }
    });
      	
        long ans = 0;
      	for (int i = 0 ; i < n; i++) {
			for (int j = 0; j < n; j++) {
              	if ((blue[i][0] > red[j][0]) && (blue[i][1] > red[j][1])){
                	ans++;
                	red[j][0] = 2 * n;
                	red[j][1] = 2 * n;
                	break;
              	}
			}
        }
      
      System.out.println(ans);
    }
    
}