import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String[] array = str.split("");
        List<String> list = Arrays.asList(array);
	    Set<String> setArray = new HashSet<String>(list);
	    String ans = (setArray.size() == 2)? "Yes": "No";
	    System.out.println(ans);
	}
}