import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 */

public class Main {

	public static void printlnYN(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws IOException {

		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

    	int A = sc.nextInt();
    	int B = sc.nextInt();

    	int max = A+B;
    	if(A-B > max) max = A-B;
    	if(A*B > max) max = A*B;
    	System.out.println(max);
	}

}