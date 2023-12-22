import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String head = s.substring(0,2);
		String tail = s.substring(2,4);

		int intHead = Integer.parseInt(head);
		int intTail = Integer.parseInt(tail);

		if(1 <= intHead && intHead <= 12 && 1 <= intTail && intTail <= 12) {
			System.out.println("AMBIGUOUS");
		}else if(1 <= intHead && intHead <= 12) {
			System.out.println("MMYY");
		}else if(1 <= intTail && intTail <= 12) {
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
	}
}
