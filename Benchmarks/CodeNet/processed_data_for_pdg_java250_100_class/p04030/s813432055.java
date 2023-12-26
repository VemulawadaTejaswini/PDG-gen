public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = "";
		sc.close();
		for(int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			if(character == '0' || character == '1') {
				answer += character;
			}else if(character == 'B') {
				if(answer.length() == 0) {
				}else{
					answer = answer.substring(0, answer.length()-1);
				}
			}
		}
		System.out.println(answer);
	}
}
