import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		
		
		for (int i=0; i<S.length(); i++){
			char s = S.charAt(i);
			char t = T.charAt(i);
			
			if (s!=t){
				S = S.replace(s,Character.toUpperCase(t));
				S = S.replace(t, Character.toUpperCase(s));
				S = S.toLowerCase();
			}
			
		}
		
		if (S.equals(T))
			System.out.println("Yes");
		else 
			System.out.println("No");
			
		sc.close();

	}

}
