import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int x = sc.nextInt();
    	int y = sc.nextInt();

    	int xl = -100;
    	int ys = 100;
    	String ans = " War";

    	for (int i = 0; i < n; i++){
        	int xn = sc.nextInt();
        	if (xn > xl){
        		xl = xn;
        	}
    	}

    	for (int j = 0; j < m; j++){
        	int ym = sc.nextInt();
        	if (ym < ys){
        		ys = ym;
        	}

    	}


    	if (x < ys && ys <= y && xl < ys){
    		ans = "No War";

    	}


    	// 出力
    	System.out.println(ans);
    }
}