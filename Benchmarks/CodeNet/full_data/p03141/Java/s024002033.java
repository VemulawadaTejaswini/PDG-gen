import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 文字列の長さ
		
		int[] As = new int[N];
		int[] Bs = new int[N];
		int[] diffs = new int[N];
	    for (int i = 0; i < N; i++) {
	        As[i] = sc.nextInt();
	        Bs[i] = sc.nextInt();
	        diffs[i] = As[i] - Bs[i];
	    }

        boolean[] flag = new boolean[N];
        Arrays.fill(flag, true);
        long result = 0;
        
        for (int i = 0; i < N / 2; i++) {
            int minJ = -1;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (!flag[j]) continue;
                if (diffs[j] < min) {
                    minJ = j;
                    min = diffs[j];
                }
            }
            flag[minJ] = false;
            result += As[minJ];
            
            minJ = -1;
            min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (!flag[j]) continue;
                if (diffs[j] < min) {
                    minJ = j;
                    min = diffs[j];
                }
            }
            flag[minJ] = false;
            result -= Bs[minJ];
        }
        
        if (N % 2 != 0) {
            for (int i = 0; i < N; i++) {
                if (flag[i]) {
                    result += As[i];
                    break;
                }
            }
        }
        
        System.out.println(result);
	}
}