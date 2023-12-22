import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    	Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		// 出力
		int buff = a*100 + b*10 + c;
		if(buff%4==0){
		  System.out.println("YES");  
		}else{
		   System.out.println("NO");  
		}
		
    }
}