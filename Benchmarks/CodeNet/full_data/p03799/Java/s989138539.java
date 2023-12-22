import java.io.*;
import java.util.Scanner;
class Test {
    public static void ain(String args[]) throws IOException {
    	// TODO 自動生成されたコンストラクター・スタブ
    	Scanner sc = new Scanner(System.in);
    	int s = sc.nextInt();
    	int c = sc.nextInt();
    	
    	int c_s = (int)((c-s)%2);
    	System.out.println(s + c_s);
    }
}
