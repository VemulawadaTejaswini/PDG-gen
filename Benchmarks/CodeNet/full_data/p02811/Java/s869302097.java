import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	int K = Integer.parseInt(sc.next());
      	int X = Integer.parseInt(sc.next());
      
      	if (500 * K >= X) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}