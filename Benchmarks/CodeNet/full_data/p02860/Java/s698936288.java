import java.util.Scanner;
public class Main{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int N = sc.nextInt();
	String S = sc.next();

	int halfN = N/2;



	//文字列の前半
	String halfS1 = S.substring(0,halfN);
	String result = halfS1+halfS1;

	//一致の確認と出力
	if(result.equals(S)){
		System.out.println("Yes");
	}
		else{
			System.out.println("No");
		}
	}
}

