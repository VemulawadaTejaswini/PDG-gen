import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		if(isOverlap(S)){
			System.out.println("no");
		}
		else{
			System.out.println("yes");
		}

		sc.close();
	}

	static boolean isOverlap(String S){
		HashSet<Character> set = new HashSet<Character>();
		for(char c: S.toCharArray()){
			if(set.contains(c)){
				return true;
			}
			else{
				set.add(c);
			}
		}
		return false;
	}

}
