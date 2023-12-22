import java.util.Scanner;


public class signboard {
	
	private static final String str = "CODEFESTIVAL2016";
	private static int count = 0;
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		String str1 = reader.next();
		
		for (int i=0;i<16;i++){
			if (str1.charAt(i)!=str.charAt(i)){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
