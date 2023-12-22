import java.util.Scanner;
import java.lang.Exception;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
        	int c = sc.nextInt();
       		System.out.println("Yes");        	
        }catch(Exception c){
       		System.out.println("No");        	
        }
    	

    }
 }