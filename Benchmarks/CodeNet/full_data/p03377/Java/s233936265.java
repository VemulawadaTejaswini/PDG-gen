import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String args[]) throws IOException {
		String a = null;
		String b = null;
      	String c = null;
		Scanner scan = new Scanner(System.in);
      a = scan.next();
      b = scan.next();
      c = scan.next();
		//while (scan.hasNext()) {
		//List<int> list = new ArrayList<int>();
		//list.add(scan.next());
		//}
      	//if(list.get(0) + list.get(1) <= list.get(2) && list.get(0) >= list.get(2)) System.out.println("YES");
      if(Integer.parseInt(a) + Integer.parseInt(b) >= Integer.parseInt(c) && Integer.parseInt(a) <= Integer.parseInt(c)) System.out.println("YES");	
      else System.out.println("NO");
    }
}