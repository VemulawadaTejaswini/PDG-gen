import java.util.Scanner;

public class Main {

	private static void core(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i-1)!=s.charAt(i)){
				count++;
			}
		}
		System.out.println(count);
	}
	
	/*
	Scanner sc = new Scanner(System.in);
	*/

	
	public static void main(String[] args) {
		core();
	}
	
}
