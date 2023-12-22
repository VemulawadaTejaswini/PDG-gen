import java.util.Scanner;
class doubleFactorial{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int input = s.nextInt();
		String answer = String.valueOf(doubleFact(input));
		int i = answer.length();
		int count = 0;
		while(true){
			if (answer.charAt(i-1)=='0') {
				count+=1;
			}else{
				break;
			}
			i--;
		}
		System.out.println(count);
	}
	private static int doubleFact(int n){
		if (n<=1) {
			return 1;
		}else {
			return n*doubleFact(n-2);
		}
	}
}