import java.util.Scanner;

public class aPrefixAndSuffix {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        // 文字列の比較
        int res = 0;
        int i = 0;
        if(s.equals(t)) res = N;
        else {
        	for(i=1; i<=N; i++) {
        		if(s.substring(i).equals(t.substring(0, N-i)))
        			break;
        	}
    		res = N + i;
        }

        // 出力
        System.out.println(res);
        sc.close();
	}

}