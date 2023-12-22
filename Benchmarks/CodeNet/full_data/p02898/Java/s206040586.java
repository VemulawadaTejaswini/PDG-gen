import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	int enterCnt = 0; 
      
      	for (int i = 0; i < n; i++) {
        	int h = Integer.parseInt(sc.next());
          	if (k <= h) { enterCnt++; }
        }
      
      	System.out.println(enterCnt);
    }
}