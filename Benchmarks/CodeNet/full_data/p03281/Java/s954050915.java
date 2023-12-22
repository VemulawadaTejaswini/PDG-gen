import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();

    	int ans = 0;

    	if (n <= 105){
    		ans = 1;

    	} else {
    		ans++;
	    	for (int j = 107; j <= n; j+=2){
	    		int sum = 0;
	    		for(int i =1; i <= j; i++){
	    			while((n % i)== 0){
	    				sum++;
	    			}
	    		}

	    		if (sum == 8) {
	    			ans++;
	    		}
	    	}
    	}
    	// 出力
    	System.out.println(ans);
    }
}