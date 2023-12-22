import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] A = new int[N][3];
		for(int i = 0; i < N; i++) {
			A[i][0] = s.nextInt();
			A[i][1] = s.nextInt();
			A[i][2] = s.nextInt();
		}
		
		int result = Math.max(vac(N, 0, A), vac(N, 1, A));
		result = Math.max(vac(N, 2, A), result);
		System.out.println(result);
    }
  
  	private static int vac(int day, int activity, int[][] A) {
		int cha = (activity + 1) % 3;
		int chb = (activity + 2) % 3;
		if(day == 1) {
			return Math.max(A[0][cha], A[0][chb]);
		}
		return Math.max(vac(day - 1, cha, A), vac(day - 1, chb, A)) + A[day-1][activity];
	}
}