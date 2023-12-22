import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();

		if (!S.contains("x")){
			System.out.println(1000);
		}else if (S.equals("oox")){
			System.out.println(900);
		}else if (S.equals("oxo")){
			System.out.println(900);
		}else if (S.equals("xoo")){
			System.out.println(900);
		}else if (S.equals("xxx")){
			System.out.println(700);
		}else {
			System.out.println(800);
		}
	}
}