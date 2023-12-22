import java.util.*;
public class Main {
	public static void main(String[] args) {
        // 文字をキーボードから入力し、配列に記憶
        // Scannerクラスのインスタンスの生成
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        int n = 0;
        int a = 0;
        int flag = 0;
        
        for (int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) == 'B' && flag == 0) {
        		flag = 1;
        	}
        	if(flag == 1) {
        		if(str.charAt(i) == 'W') {
        			n += a;
        		}
        		if(str.charAt(i) == 'B') {
        			a++;
        		}
        	}
        }
        System.out.println(n);
	}
}