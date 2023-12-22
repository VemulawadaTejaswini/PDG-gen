import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = 25 - Integer.parseInt(sc.next());
		ou.print("Christmas");
		for(int i = 0 ; i < n ; i++) ou.print(" Eve");
		ou.println();
		ou.flush();
	}
}