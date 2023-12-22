import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(str.length() < 4)
			System.out.println("No");
		else if(str.substring(0,4).equals("YAKI"))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}