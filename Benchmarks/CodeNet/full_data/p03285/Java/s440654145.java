import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 4 == 0 || input % 4 == 3 || input % 7 == 0 || input % 7 == 4) {
        	System.out.println("Yes");
        } else {
			System.out.println("No");        	
        }
    }
}