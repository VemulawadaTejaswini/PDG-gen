import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String s = sc.nextLine();
		
		String out = "";
		boolean[] b = new boolean[s.length()];
		for(int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'G'|| s.charAt(i) == 'C'|| s.charAt(i) == 'T'){
				b[i] = true;
			}else {
				b[i] = false;
			}
		}
		
		for(int i = 0; i < b.length-1; i++) {
			if (b[i] == true) {
				if(b[i+1] == true || b[i+1] == false) {
					out += s.charAt(i);
				}
			}
			
		}
		System.out.println(out.length());
	}

}
