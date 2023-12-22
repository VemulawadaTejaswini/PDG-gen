import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int n = sc.nextInt();
    	int x = sc.nextInt();
    	int min = 100000;
    	int cnt = 0;

    	for (int i = 0; i < n; i++){
    		int m = sc.nextInt();
    		x-= m;
    		min = Math.min(m, min);
    		cnt++;
    	}

    	while(x >= min) {
    		x-= min;
    		cnt++;
    	}

    	// 出力
    	System.out.println(cnt);
    }
}