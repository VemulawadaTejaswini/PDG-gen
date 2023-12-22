import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
    	int w = Integer.parseInt(sc.next());
      	int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      
      	int dis = b - (w + a) >= 0 ? b - (w + a) : 0;
      	
      	System.out.println(dis);
    }
}