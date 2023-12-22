import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] s = stdIn.next().split("");
		boolean flag = false;
		
		for(int i = 0; i < s.length-1; i++) {
			if(!s[i].equals(s[i+1])){
				flag = true;
			}
				
			
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
	}

}
