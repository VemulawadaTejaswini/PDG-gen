import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char c = (char)sc.nextInt();
		if(c == 'A') System.out.println("T");
		else if(c == 'C')System.out.println("G"); 
		else if(c == 'T')System.out.println("A");
		else System.out.println("C");
	}
}