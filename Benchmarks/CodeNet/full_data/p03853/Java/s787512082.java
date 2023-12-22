import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
	
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		
		String[] array = new String[H];
		for(int i=0; i<H; i++){
			array[i] = s.next();	
		}
		
		// 表示
		for(int i=0; i<H; i++){
			System.out.println(array[i]);
			System.out.println(array[i]);
		}	
	}