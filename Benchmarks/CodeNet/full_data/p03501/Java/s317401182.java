
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
			
		int plan1 = n * a;
		int plan2 = b;
		int plan;
		
		if(plan1<plan2){
			plan = plan1;
		}else{
			plan = plan2;
		}		
		System.out.println(plan);
				

	}
}