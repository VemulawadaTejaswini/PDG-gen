import java.util.Scanner;

public class YYMMorMMYY {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String S        = scanner.next();
		//上2桁を取得し数値に変換
		int front = Integer.parseInt(S.substring(0,2));
		//下2桁を取得し数値に変換
		int back  = Integer.parseInt(S.substring(2,4));

		//NAの場合
		if(front == 00 || back == 00) {
			
			System.out.println("NA");
		
		//AMBIGUOUSの場合
		}else if(front <= 12 && back <= 12){
			
			System.out.println("AMBIGUOUS");
			
		//YYMMの場合
		}else if(back <= 12){
			
			System.out.println("YYMM");
			
		//MMYYの場合
		}else{
			
			System.out.println("MMYY");
		}
	}
}