import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt(); 
		int h = sc.nextInt(); 
		int w = sc.nextInt(); 
		System.out.println((H-h)*(W-w)); 
	}
}