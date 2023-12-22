import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int div = 0;
		for (char c : S.toCharArray()) {
			div += Character.getNumericValue(c);
		}
		
		System.out.println(Integer.parseInt(S) % div == 0 ? "Yes": "No");
	}
	
}