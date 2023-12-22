import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	
		// 1段目の宝石数
		int n = sc.nextInt();
      
      	int[] calcList = new int[n];
     
        // 2段目のvの数値
      	for (int i=0; i < n; i++) {
          calcList[i] = sc.nextInt();
        }
      
        // 3段目のvの数値
		for (int i=0; i < n; i++) {
           calcList[i] = calcList[i] - sc.nextInt();
        }
      
        int max = 0;
		for (int calcNum : calcList) {
          if (calcNum > 0) {
            max += calcNum;
          }
        }
      
        System.out.println(max);
	}
}