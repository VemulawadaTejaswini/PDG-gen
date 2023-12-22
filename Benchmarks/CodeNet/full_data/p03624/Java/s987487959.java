import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		sc.close();
		
		char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
				's','t','u','v','w','x','y','z'};
		
		boolean none = true;
		
		
		for(char alfa: abc) {
			if(s.indexOf(alfa) == -1) {
				System.out.println(alfa);
				none = false;
				break;
			}
		}
		
		if(none) {
			System.out.println("None");
		}

	}

}
