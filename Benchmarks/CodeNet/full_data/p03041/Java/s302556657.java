import java.util.*;

public class Main{

    public static void main(String args[]){

        //配列の宣言
        int[] number = new int[5];
        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int k = sc.nextInt();
        String s = sc.next();
        String s2 = s.substring(0, k-1) + s.substring(k-1, k).toLowerCase() + s.substring(k, n);

        // 出力
        System.out.println(s2);

    }

}
