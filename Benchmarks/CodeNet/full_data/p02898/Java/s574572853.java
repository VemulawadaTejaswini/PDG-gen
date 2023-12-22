import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int ans = 0;
		for(int i = 1;i <= N;i++) {
			int h = sc.nextInt();
			if(K<=h) {
				ans ++;
			}
		}

		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}
