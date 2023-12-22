import java.util.Scanner;

//A>B のときGREATER、A<B のときLESS、A=B のときEQUALと出力せよ。
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strA = sc.next();
		String strB = sc.next();
		
		int lenA = strA.length();
		int lenB = strB.length();		
		
		if(lenA > lenB) {
			System.out.println("GREATER");
		} else if(lenA < lenB) {
			System.out.println("LESS");
		} else {
			int i;
			for(i = 0; i < lenA; i++) {
				if(strA.charAt(i) > strB.charAt(i)) {
					System.out.println("GREATER");
					break;
				} else if(strA.charAt(i) < strB.charAt(i)) {
					System.out.println("LESS");
					break;
				}
			}
			if(i == lenA) {
				System.out.println("EQUAL");
			}
		}		

	}

}
