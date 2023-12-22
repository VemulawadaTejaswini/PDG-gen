
import java.io.*;
import java.util.*;


	public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int aposition = x.indexOf("A");
		int zposition=x.lastIndexOf("Z");
		int total = zposition-aposition +1;
		System.out.print(total);
		}
		}
	
