import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static boolean debug = true;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String str=sc.nextLine();
		int[] map=new int[3];
		for(char c:str.toCharArray()){
			if(c=='a') map[0]++;
			else if(c=='b') map[1]++;
			else map[2]++;
		}
		int max=Math.max(map[0],Math.max(map[1], map[2]));
		int min=Math.min(map[0],Math.min(map[1], map[2]));
		if(max-min<2)
			System.out.println("YES");
		else
			System.out.println("NO");
			
	}

}