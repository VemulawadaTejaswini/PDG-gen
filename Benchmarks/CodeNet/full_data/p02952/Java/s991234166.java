import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      
      	int result = 0;
      	for(int i = 1 ; i <= n ; i++ ) {
          	if ( String.valueOf(i).length() % 2 == 1 ) {
              result++;
            }
        }
      	System.out.println(result);
	}
}