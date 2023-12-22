import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[]c = sc.next().toCharArray();
		Set<Character>charset =new TreeSet<Character>();
		char[]alp = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int i = 0; i < c.length; i++) {
			charset.add(c[i]);
		}

		for (int i = 0; i < c.length; i++) {
			if (c[i] != alp[i]) {
				System.out.println(alp[i]);
				break;
			}else if(i==alp.length-1){
				System.out.println("none");
			}
		}

	}
}


