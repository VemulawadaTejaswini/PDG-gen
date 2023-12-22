import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		String ans = "";

		// 配列
		int[] ls = new int[N];

		for (int i = 0; i < N;i ++ ){
			// 値の入力
			int str = sc.nextInt();

			ls[str-1] = i;
		}

		for (int i = 0; i < N;i ++ ){
        	if(ans.isEmpty()) {
            	ans = "" + (ls[i]+1);
        	}else {
            	ans = ans + " " + (ls[i]+1);
        	}
        }

		
		System.out.println(ans);

   		sc.close();
        return ;

    }
    
    static long Factorial (int i) {
    	if (i == 0) {return 1;}

    	if (i == 1) {
    		return 1;
    	}else {
    		return (i * Factorial(i-1));
    	}
    }
}

