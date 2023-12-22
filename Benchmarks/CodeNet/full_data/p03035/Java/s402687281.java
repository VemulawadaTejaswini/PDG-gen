import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力　年齢
		int A = sc.nextInt();
		// 整数の入力　料金
		int B = sc.nextInt();
		
		int ans = 0;
		
		if((A>=6)&(A<=12)){
			ans = B / 2;
		}else if(A>=13){
			ans = B;
		}

		System.out.println(ans);

   		sc.close();
        return ;

    }
    
}

