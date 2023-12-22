import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                r++;
            }
        }
      	System.out.println(r);
		// System.out.println(Arrays.stream(s).filter("1"::equals).count());
	}
}