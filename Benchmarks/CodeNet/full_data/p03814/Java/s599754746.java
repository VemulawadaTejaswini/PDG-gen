
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
	Scanner sc= new Scanner(System.in);
	
	String str = sc.next();
	String line = str.substring(str.indexOf("A"), str.lastIndexOf("Z"));
	System.out.println(line.length()+1);
	
	}
}
