
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		if((str.charAt(1)!='0'&&str.charAt(3)!='0')) {
			if(((str.charAt(0)-'0')*10+(str.charAt(1)-'0')<=12)&&(str.charAt(2)-'0')*10+(str.charAt(3)-'0')<=12)
			System.out.println("AMBIGUOUS");
			else if((str.charAt(2)-'0')*10+(str.charAt(3)-'0')<=12){
				System.out.println("YYMM");
			}else if((str.charAt(0)-'0')*10+(str.charAt(1)-'0')<=12){
				System.out.println("MMYY");
			}else {
				System.out.println("NA");
			}
			
		}else {
			System.out.println("NA");
		}
	}

}
