import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		HashSet<String> s = new HashSet<>(); 
		for (i = 0; i < n; i++) {
			s.add(sc.next());
		}
		sc.close();
		out.println(s.size()==3?"Three":"Four");
	}
}
