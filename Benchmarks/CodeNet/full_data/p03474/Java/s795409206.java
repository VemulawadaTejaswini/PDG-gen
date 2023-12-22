import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	String s = sc.next();
	boolean f1 = false;
	boolean f2 = false;
	boolean fx = false;
	for(int i = 0; i < a; i++) {
		for(int j = 0; j <= 9; j++) {
			if(Character.getNumericValue(s.charAt(i)) == j) {
				f1 = true;
				break;
			} 
		}
	}
	if(s.charAt(a) == '-') {
		fx = true;
	}
	for(int i = a + 1; i < a + b + 1; i++) {
		for(int j = 0; j <= 9; j++) {
			if(Character.getNumericValue(s.charAt(i)) == j) {
				f2 = true;
				break;
			} 
		}
	}
	if(f1 == true && f2 == true && fx == true) {
		System.out.println("Yes");
	} else {
		System.out.println("No");
	}
}
}