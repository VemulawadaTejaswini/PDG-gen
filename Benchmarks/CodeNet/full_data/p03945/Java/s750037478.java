import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		
		int count = 0;
		while(!isAllBlackOrWhite(in)){
			in = putLeft(in);
			count++;
		}
		
		System.out.println(count);
	}
	
	static String putLeft(String str){
		boolean b = str.charAt(0) == 'B';
		int first = str.indexOf(b? "W": "B");
		return (b?"W":"B") + str.substring(0, first).replace(b?'B':'W', b?'W':'B') + str.substring(first, str.length());
	}
	
	
	static boolean isAllBlackOrWhite(String str){
		char l = str.charAt(0);
		for(char c: str.toCharArray()){
			if(c != l) return false;
		}
		return true;
	}
}
