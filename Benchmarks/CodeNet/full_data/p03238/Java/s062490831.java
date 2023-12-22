import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		//		String [][] boad = new String[4][4];
		List <Integer> list = new ArrayList<Integer>();
//		String s = sc.next();
		int answer = 0;
		int in = Integer.parseInt(sc.next());
//		int c = 0;
		String d = null;
		if(in == 1){
			d = "Hello World";
		}else{
			int in2 = Integer.parseInt(sc.next());
			int in3 = Integer.parseInt(sc.next());
			int b = 0;

			d = String.valueOf(in2 + in3);
		}

		
//		for(int i = 0;i<n;i++){
//			list.add(Integer.parseInt(sc.next()));
//		}
		
		System.out.println(d);
		System.out.flush();
		sc.close();
	}
}