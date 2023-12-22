import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner SC = new Scanner(System.in);
String S = SC.next();
char[] Array = S.toCharArray();
for(int i = 0; i < S.length(); i++) {
	if(i % 2 == 0) {
		System.out.print(Array[i]);
	}
}
System.out.println();
	}

}