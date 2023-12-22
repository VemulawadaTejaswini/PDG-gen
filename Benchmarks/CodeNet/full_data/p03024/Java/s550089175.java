import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner tc = new Scanner (System.in);
	int k, cont=0;
	String S;
	S = tc.next();
	k = S.length();
	if(k>=1&& k<=15) {
	for (int i = 0; i<k; i++) {
		if (S.charAt(i) == 'x') {
			cont++;              
			} 
	}
	
	if(cont<=7) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	}
}
}
