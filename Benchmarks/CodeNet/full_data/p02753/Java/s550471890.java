import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = Integer.parseInt();
		System.out.println(calculate(sc.next()));
	}
	static String calculate(String s){
		int a = 0;
		int b = 0;
		for(char c: s.toCharArray()){
			a += c == 'A'? 1 : 0;
			b += c == 'B'? 1 : 0;
		}
		if(a == 2 && b == 1) return 'Yes';
		if(a == 1 && b == 2) return 'Yes';
		return 'No'
	}
 
}