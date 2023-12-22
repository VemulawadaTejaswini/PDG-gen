import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	int ans;

    	//Aliceが先、かぶってない
    	if (a < d && b < c) {
    		ans = 0;

    	//Bobが先、かぶってない
    	} else if (d < a && c < b) {
    		ans = 0;

    	//Alicaが先、Aliceが長い
    	} else if (a < c && b < d) {
    		ans = d - c;

    	//Bobが先、Bobが長い
    	} else if (c < a && d < b) {
    		ans = b - a;

    	} else {
    		ans = Math.abs(c - b);
    	}


    	// 出力
    	System.out.println(ans);
    }
}