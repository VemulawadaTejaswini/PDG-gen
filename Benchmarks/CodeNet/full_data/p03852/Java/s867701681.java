import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
    String[] str_list = {"a","i","u","e","o"};
		if (Arrays.asList(str_list).contains(a)) {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
  }
}