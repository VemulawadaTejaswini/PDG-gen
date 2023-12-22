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

    	int N = sc.nextInt();
    	String S = sc.next();

    	int min = N+1;


    	for(int i = 0; i <= N - 1; i++){
    		int m = 0;

    		for(int j = 0; j < N; j++){
    			if(i != 0 && j < i && S.charAt(j) == 'W'){
    				m++;
    			}
    			else if(i != N-1 && j > i && S.charAt(j) == 'E'){
    				m++;
    			}

    		}

    		if(m < min) min = m;
    	}

    	System.out.println(min);

	}
}