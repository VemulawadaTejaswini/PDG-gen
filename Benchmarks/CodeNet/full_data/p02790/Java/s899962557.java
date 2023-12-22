import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
        
        StringBuilder ab = new StringBuilder();
        StringBuilder ba = new StringBuilder();
      
        for (int i = 0; i < Integer.parseInt(b); i++) {
            ab.append(a);
        }
      
        for (int i = 0; i < Integer.parseInt(a); i++) {
            ba.append(b);
        }

      
        String answer = null;
        if (a.charAt(0) <= b.charAt(0)) {
            System.out.println(ab);
        } else {
            System.out.println(ba);
        }
	}
}