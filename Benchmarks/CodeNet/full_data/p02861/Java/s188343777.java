import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] city = new int[n][2];
		for(int i = 0; i < n; i++){
		    city[i][0] = sc.nextInt();
		    city[i][1] = sc.nextInt();
		}
		
		// 計算
		double result = 0;
		double[][] dist = new double[n][n];
		for(int i = 0; i < n; i++){
		    for(int j = i+1; j < n; j++){
		        double x2 = (city[i][0] - city[j][0])*(city[i][0] - city[j][0]);
		        double y2 = (city[i][1] - city[j][1])*(city[i][1] - city[j][1]);
		        dist[i][j] = sqrt(x2 + y2);
		        dist[j][i] = sqrt(x2 + y2);
		    }
		}
		double sum = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        if(i == j) continue;
		        sum += dist[i][j];
		    }
		}
		result = sum/n;
		
		// 出力
		System.out.println(result);
	}
}
