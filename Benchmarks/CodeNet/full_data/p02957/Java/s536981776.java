import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		System.out.println((b-a)%2 == 0 ? (b-a)/2 : "IMPOSSIBLE");
	}
}
