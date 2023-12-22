
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数値の入力
        //        int s = sc.nextInt();
        // 文字の入力
        String str = sc.next();
        boolean flg =false;
        if (str.contains("A")) {
            if (str.contains("B")) {
            	flg = true;
            }
        }
        
        if(flg) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}
