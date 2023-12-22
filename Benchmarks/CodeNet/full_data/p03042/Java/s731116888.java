import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
				
		String s = sc.next();
		
		String a = s.substring(0,2);
		String b = s.substring(2,4);
		
		int t = Integer.parseInt(a);
		int r = Integer.parseInt(b);
		
		if(1<=t && t<=12) {
			if(1<=r && r<=12) {
				System.out.println("AMBIGUOUS");
			}
			if(r>12 || r==0) {
				System.out.println("MMYY");
			}
		}
		if((1<=r && r<=12 )&&( t > 12 || t == 0)) {
			System.out.println("YYMM");
		}
		if((r>12 || r == 0) && (t >12 || t ==0)) {
			System.out.println("NA");
		}
				
		}
}
