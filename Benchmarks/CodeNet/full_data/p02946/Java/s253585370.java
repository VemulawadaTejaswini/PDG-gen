import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		int X = sc.nextInt();
		int min = X - K + 1;
		int max = X + K - 1;
		String ans = "";
	
		while(min <= max){
			if(min!=(X - K + 1)) {
				ans = ans + " ";
			}
			ans = ans + min;
			min ++;
			
		}

		System.out.println(ans);
		

   		sc.close();
        return ;

    }
    
}

