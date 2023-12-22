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
        	if (y == "BTC"){
        		x = x * 380000.0;
        	}
        	sum += x;
    	}

    	// 出力
    	System.out.println(sum);
    }
}