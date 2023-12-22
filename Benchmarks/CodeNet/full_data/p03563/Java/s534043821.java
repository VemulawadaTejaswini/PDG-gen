import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		ou.println(2 * b - a);
		ou.flush();
	}
}