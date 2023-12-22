import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        	s2.append('x');

        System.out.println(s2.toString());
    }
}
