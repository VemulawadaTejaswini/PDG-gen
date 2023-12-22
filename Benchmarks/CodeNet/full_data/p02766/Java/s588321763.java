import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       String str = Integer.toString(n); 
       int k = sc.nextInt(); 
       String convert = Integer.toString(Integer.parseInt(str,10),k); 
       System.out.println(convert.length());
	}
}