
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n + 1][26];
		//a =97
		String s = sc.next();
		char[] cAry = s.toCharArray();
		int count = 1;
		for(char c : s.toCharArray()){
			for(int i = count; i <= n; i++){
				matrix[i][c - 97]++;
			}
			count++;
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			if(sc.nextInt() == 1){
				int p = sc.nextInt();
				char c = sc.next().toCharArray()[0];
				char cBefore = cAry[p - 1];
				if(c != cBefore){
					for(int k = p; k <= n; k++){
						matrix[k][c - 97]++;
						matrix[k][cBefore - 97]--;
					}
				}
			}else{
				int p1 = sc.nextInt();
				int p2 = sc.nextInt();
				int count2 = 0;
				for(int k = 0; k < 26; k++){
					if(matrix[p2][k] - matrix[p1 - 1][k] > 0){
						count2++;
					}
				}
				System.out.println(count2);
			}
		}
	}
}
