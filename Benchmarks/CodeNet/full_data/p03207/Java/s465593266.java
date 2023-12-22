import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();

	int pmax = 0;
	int total = 0;
	int a;
	for (int i = 1; i <= n; i++){
	    a = sc.nextInt();
	    total += a;
	    if (a > pmax){
		pmax = a;
	    }
	}
	total -= pmax / 2;

	// 出力
	System.out.println(total);
    }
}
