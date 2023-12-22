import java.util.*

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] box = new int[n];
        for (int i = 0; i < n; i++) {
        	box[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
        	int diff = Math.abs(box[i] - box[i+k-1])
            int tmp = diff + Math.min(Math.abs(x[i]), Math.abs(x[i + k - 1]));
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}