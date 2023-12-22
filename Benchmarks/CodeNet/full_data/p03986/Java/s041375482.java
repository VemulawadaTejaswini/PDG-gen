import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre = 0;
		String in = sc.next();
		StringBuilder sb = new StringBuilder(in);
		boolean end = false;
		while(!end) {
			end = true;
			//System.out.println(sb.toString());
			int id = sb.indexOf("ST");
			//System.out.println(id);
			if(id == -1) break;
			sb = sb.delete(id, id + 2);
			end = false;
			
		}
		System.out.println(sb.toString().length());
	}
}