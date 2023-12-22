import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[][] e = new int[n - 1][2];
		int[][] ope = new int[q][2];
		
	    for(int i = 0; i < n - 1; i++){
			e[i][0] = sc.nextInt();
			e[i][1] = sc.nextInt();
		}
	    for(int i = 0; i < q; i++){
			ope[i][0] = sc.nextInt();
			ope[i][1] = sc.nextInt();
		}
		
		// 計算
		int[] result = new int[n];
		Arrays.fill(result, 0);

        for(int i = 0; i < q; i++){
            operation(e, ope[i][0], ope[i][1], result);
        }

		// 出力
        for(int i = 0; i < n; i++){
            System.out.print(result[i]);
            System.out.print(" ");
        }
		
	}

    static void operation(int[][] e, int q, int x, int[] result){
        result[q - 1] += x;
        for(int j = 0; j < e.length; j++){
		    if(e[j][0] == q){
		    	operation(e, e[j][1], x, result);
		    }
		}
    }
}
