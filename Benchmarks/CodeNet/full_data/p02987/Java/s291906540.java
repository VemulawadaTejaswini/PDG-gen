package atCoder;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


        // Scannerクラスのインスタンスの生成
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = s.split("");

        if(ss[0].equals(ss[1]) && ss[2].equals(ss[3])) {
        	System.out.println("Yes");
        } else if (ss[0].equals(ss[2]) && ss[1].equals(ss[3])) {
        	System.out.println("Yes");

        } else if (ss[0].equals(ss[3]) && ss[1].equals(ss[2])) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}

}