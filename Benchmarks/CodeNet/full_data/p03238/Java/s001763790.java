import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input_N = sc.next();
 
        // programming
        if (input_N.equals("1")) {
            System.out.println("Hello World");
        } else {
            int input_A = Integer.parseInt(sc.next());
            int input_B = Integer.parseInt(sc.next());
            System.out.println(input_A + input_B);
        }
	}
}