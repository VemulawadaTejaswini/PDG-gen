import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int T = sc.nextInt();
		int min = 10000;
		
		int num[][] = new int[2][N];

		for(int i = 0;i < N;i++){
			num[0][i] = sc.nextInt();
			num[1][i] = sc.nextInt();
		}

		for(int i = 0;i < N;i++){
			if(num[1][i]<=T){
				if(num[0][i]<min){
					min = num[0][i]; 
				}
			}
		}

		if(min == 10000){
			System.out.println("TLE");
		}else{
			System.out.println(min);
		}

   		sc.close();
        return ;

    }
    
}

