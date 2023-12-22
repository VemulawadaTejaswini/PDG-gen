import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();

	/* 処理 */
	long ans = 1;
	for(int i = 1; i <= n; i++){
	    ans *= i;
	    ans %= (int)(Math.pow(10,9)+7);
	}

	/* 出力 */
	System.out.println(ans);
    }
}
