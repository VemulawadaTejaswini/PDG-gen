import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int countA = 0;
		int countB = 0;
		int countC = 0;
		char str = a.charAt(0);
		countA++;
		while(countA < a.length() - 1 && countB < b.length() - 1 && countC < c.length() - 1){
			if(str == 'a'){
				countA++;
				str = a.charAt(countA);
			}else if(str == 'b') {
				countB++;
				str = b.charAt(countB);
			}else if(str == 'c') {
				countC++;
				str = c.charAt(countC);
			}
		}
		if(str == 'a') {
			str = 'A';
		}else if(str == 'b'){
			str = 'B';
		}else{
			str = 'C';
		}
		System.out.println(str);
	}

}
