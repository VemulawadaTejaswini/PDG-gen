import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int x = sc.nextInt();
    	int y = sc.nextInt();

    	int sum1 = 0;
    	int sum2 = 0;
    	int sum3 = 0;

    	//aピザ　bピザ
    	sum1 = a * x + b * y;

    	//abピザも購入
    	if (x < y){
    		sum2 = x * c * 2 + (y - x) * b;
    		sum3 = y * c * 2;

    	} else {
    		sum2 = y * c * 2+ (x - y) * a;
    		sum3 = x * c * 2;
    	}


    	// 出力
    	//System.out.println(sum1);
    	//System.out.println(sum2);
    	System.out.println(Math.min(Math.min(sum1, sum2), sum3));
    }
}