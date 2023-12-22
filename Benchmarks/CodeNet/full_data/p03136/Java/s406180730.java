import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int hen[] = new int[n]; 
        int big;
		for(int i = 0;i < n; i++){
          hen[i] = sc.nextInt();
        }
        Arrays.sort(hen);
        big = hen[n - 1];
        for(int i = 0;i < n - 1; i++){
          big -= hen[i];
        }
        if(big < 0){
        	System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}