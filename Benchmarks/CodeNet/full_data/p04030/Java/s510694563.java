import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String answer="";

		for(int i=0; i<s.length();i++) {
			char target = s.charAt(i);
			if(target=='0') {
				answer+='0';
			}
			if(target=='1') {
				answer+='1';
			}
			if(target=='B') {
				if(answer != null && answer.length() > 0){
					answer = answer.substring(0, answer.length()-1);
				}
			}
		}
		
		System.out.println(answer);

	}
}