import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String A =scan.next();
		String B =scan.next();
		String C = scan.next();
		A = A.toUpperCase();
		B = B.toUpperCase();
		C = C.toUpperCase();
        char [] an = new char[3];
        an[0] = A.charAt(0);
        an[1] = B.charAt(0);
        an[2] = C.charAt(0);
		
        for(char h: an){
        	System.out.print(h);
        }
	}}
