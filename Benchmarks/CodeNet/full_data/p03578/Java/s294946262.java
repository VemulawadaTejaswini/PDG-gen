import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	ArrayList<String> list = new ArrayList<>();
      	for (int i = 0; i < n; i++) {
        	list.add(sc.next());
        }
      
      	int m = Integer.parseInt(sc.next());
      	if (n < m) { System.out.println("NO"); return; }
      	for (int i = 0; i < m; i++) {
          	String k = sc.next();
        	boolean ans = list.remove(k);
          	if (!ans){ System.out.println("NO"); return; }
        }
      
      	System.out.println("YES");
    }
}