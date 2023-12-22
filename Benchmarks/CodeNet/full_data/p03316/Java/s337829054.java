import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int nn = n;
		int s = 0;
		while(nn != 0){
			s += nn % 10;
			nn /= 10;
		}
		if(n % s == 0) ou.println("Yes");
		else ou.println("No");
		ou.flush();
	}
}