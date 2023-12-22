import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
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
    	int Y = sc.nextInt();
    	
    	int x = -1, y = -1, z = -1;
    	
    	int n = Y / 10000;
    	for(int i = 0; i <= n; i++){
    		int m = (Y - 10000*i) / 5000;
    		for(int j = 0; j <= m; j++){
    			int mm = Y - 10000 * i - 5000 * j;
    			if(mm % 1000 == 0 && mm / 1000 == N - i - j){
    				x = i;
    				y = j;
    				z = N - i - j;
    				break;
    			}
    		}
    		if(x >= 0) break;
    	}
    	
    	System.out.println(x + " " + y + " " + z);
	}

}