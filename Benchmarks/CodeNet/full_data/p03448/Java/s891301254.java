import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
int x = sc.nextInt();
      int count = 0;
      for(int i = 0; i < a; i++) {
      	for(int j = 0; j < b; j++){
        	for(int k = 0; k < c; k++){
            	if ((i * 500 + j * 100 + k * 50) == x) count++;
            }
        }
      }
  // 出力
		System.out.println(count);
	}
}