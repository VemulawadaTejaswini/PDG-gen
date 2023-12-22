import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
      	int h = scanner.nextInt(), w = scanner.nextInt();
      	for (int i = 1; i <= w; i++) {
      		for (int j = 0; j < h; j++) {
				if (scanner.next().equals("snuke")) {
        			System.out.println(('A' + j) + i);
                }
        	}
        }
    }
}