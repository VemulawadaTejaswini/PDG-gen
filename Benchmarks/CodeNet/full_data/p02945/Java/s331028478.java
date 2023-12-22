import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
       	int add=a+b;
      	int sub=a-b;
      	int mul=a*b;
      
      if(add>=sub){
        if(add>=mul){
          // 出力
		System.out.println(add);
        }else{
           System.out.println(mul);
        }
      }
      else{
             if(sub>=mul){
          // 出力
		System.out.println(sub);
        }else{
           System.out.println(mul);
             }
        }
    }
}