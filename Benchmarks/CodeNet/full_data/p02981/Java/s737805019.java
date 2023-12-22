import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int a = Integer.parseInt(sc.next());
	int b = Integer.parseInt(sc.next());
	int c = Math.min(n*a,b);
	System.out.println(c);
}
}
