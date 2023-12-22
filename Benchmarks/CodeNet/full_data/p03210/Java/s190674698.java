import java.util.Scanner;

public class Main1 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x= scan.nextInt();
		String event ="Seven-Five-Three";
		String S= (String) event.subSequence(0, 5);
		String F= (String) event.subSequence(6, 10);
		String T= (String) event.subSequence(11, 16);
		String num ="";
		if(x==7){
		     num = "Seven";
		}else if(x==5){
			num = "Five";	
		}else if(x==3){
			num = "Three";
		}
		
		if(num.equalsIgnoreCase(S) || num.equalsIgnoreCase(F) || num.equalsIgnoreCase(T)){
			System.out.println("YES");
		}
		else{
			System.out.println("No");
		}
		scan.close();
	}
}
