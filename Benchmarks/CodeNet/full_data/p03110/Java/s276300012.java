import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();
    	double sum = 0;
    	for (int i = 0 ; i < n; i++){
        	double x = sc.nextInt();
        	String y = sc.next();
        	System.out.println(x);
        	System.out.println(y);
        	if (y.equals("BTS")){
        		System.out.println(y);
        		x = x * 380000.0;
        		System.out.println(x);
        	}
        	sum += x;
        	System.out.println(sum);
    	}

    	// 出力
    	System.out.println(sum);
    }
}