import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 * Integer.valueOf(char)はダメ、(String)
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
    	int[] A = new int[N];
    	for(int i = 0; i < N; i++) A[i] = sc.nextInt();
    	
    	int count = 0;
    	
    	int[] S = new int[N];
    	for(int i = 0; i < N; i++){
    		
    	}
    	
    	for(int i = 0; i < N; i++){
    		for(int j = i; j < N; j++){
    			if(i != j){
    				int xor = A[i];
    				int sum = A[i];
    				for(int k = i+1; k <= j; k++){
    					xor = xor^A[k];
    					sum = sum + A[k];
    				}
    				if(xor == sum){
    					count++;
    				}
    			}else{
    				count++;
    			}
    		}
    	}
    	
    	System.out.println(count);
	}

}