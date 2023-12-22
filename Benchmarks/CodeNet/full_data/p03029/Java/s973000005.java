import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner stdle = new Scanner(System.in);
		// 整数の入力
        int A = stdle.nextInt();
        int P = stdle.nextInt();

        int AtoP = A * 3;
        int sumP = P + AtoP;
        int ans = sumP / 2;

        System.out.println(ans);
       
    }
}