import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
		// スペース区切りの整数の入力
		String answer;
      	if(a+b==15)answer="+";
      	else if(a*b==15)answer="*";
      	else answer="x";
		
		// 出力
		System.out.println(answer);
	}
}