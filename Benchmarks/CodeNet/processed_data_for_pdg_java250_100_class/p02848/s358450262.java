public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); 
		char[] s = stdIn.next().toCharArray(); 
		if(n==0) {
			System.out.println(s);
			System.exit(0);
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < s.length; j++) {
				if(s[j] == 'Z') {
					s[j] ='A';
				}else {
					s[j]++;
				}
			}
		}	
		for(char a: s) {
			System.out.print(a);
		}
	}
}
