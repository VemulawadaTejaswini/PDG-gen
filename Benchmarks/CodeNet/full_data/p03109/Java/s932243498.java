import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		s = s.replaceAll("/","");
		Integer temp = Integer.parseInt(s);
		Integer a = Integer.parseInt("20190430");

		if(temp.compareTo(a) <= 0) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}

	}
}
