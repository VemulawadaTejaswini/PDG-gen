import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
		// 整数の入力
        int hp= sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n ; i++ ){
            sum += sc.nextInt();
        }

        if(hp <= sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
       


    
	}
}