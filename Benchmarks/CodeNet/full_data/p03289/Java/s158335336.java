import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int cCount = 0;
		
		if(s.matches("A[a-z][Ca-z]*[a-z]"))
			for(int i = 2; i < s.length()-1; i++) {
				char c = s.charAt(i);
				char e = 'C';
				if(c == e)
					cCount++;
			}
			if(cCount == 1)
				System.out.println("AC");
		else
			System.out.println("WA");
	}
}