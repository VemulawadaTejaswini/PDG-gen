import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.charAt(2) == str.charAt(3) && str.charAt(4) == str.charAt(5) ?
                "Yes" : "No");
    }
}
