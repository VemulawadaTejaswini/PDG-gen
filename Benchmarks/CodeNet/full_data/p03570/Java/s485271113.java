
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		// setOut();
		String str = sc.nextLine();
		System.out.println(help(str));

	}

	private static int help(String str) {
		// TODO Auto-generated method stub
		int[] map=new int[128];
		int count=0;
		for(int i=0;i<str.length();i++){
			map[str.charAt(i)]++;
		}
		return check(map);
	}

	private static int check(int[] map) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i='a';i<='z';i++){
			if(map[i]%2==1) 
				count ++;
		}
		if(count==0) return 1;
		return count;
	}

}