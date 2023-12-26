public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		boolean c = false;
		for(int i = 0; i < s.length; i++) {
			if(s[i] == '7') {
				c = true;
				break;
			}
		}
		if(c) {
			System.out.println("Yes"); 
		}else{
			System.out.println("No"); 
		}
	}
}
