import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.next());
        String op = sc.next();
        int num1 = Integer.parseInt(sc.next());
        if ("+".equals(op)) {
        	System.out.println(num1 + num2);
        } else {
            System.out.println(num1 - num2);
        }
    }
}