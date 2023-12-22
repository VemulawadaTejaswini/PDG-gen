import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
        if(a == b){
            if(a != c){
                System.out.println("Yes");                return ;

            }else{
                System.out.println("No");                return ;
            }
        }else if(b == c){
            System.out.println("Yes");                return ;

        }else{
            System.out.println("No");                return ;

        }
        

       
        
	}
}