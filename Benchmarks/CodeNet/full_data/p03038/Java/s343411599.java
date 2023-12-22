import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
		}
		
		int [][]b = new int [m][2];
		
		for(int i = 0 ; i < m ;i++) {
			b[i][0] = sc.nextInt();
			b[i][1] = sc.nextInt();
		}
		
		Arrays.sort(b, (x,y) -> Integer.compare(x[1],y[1]));
		Arrays.sort(a);
		
		long sum = 0;
		
		int j = b[m-1][0];// 何回数を置き換えられるか
		int k = m-1;      // どの数を置き換えるか
		
 		for(int i = 0 ; i < n ;i++) {
 			if(b[k][1] <= a[i]){
 				sum += a[i];
 				continue;        //置き換える必要がないなら置き換えない
 			}
 			else {
 				sum += b[k][1];   //置き換えて加える、回数を減らす
 				j--;
 				if(j == 0) {
 					if(k == 0) {
 						b[0][1] = -1;    //これ以上置き換える数がないなら絶対置き換えないようにする
 						continue;
 					}
 					k--;              //これ以上減らせないなら配列の次数を一つ下げる
 					j = b[k][0];      //初期化する
 				}
 			}
		}
 		
 		System.out.println(sum);
		

	}

}
