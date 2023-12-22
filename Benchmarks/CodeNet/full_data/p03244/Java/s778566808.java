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
		List <String> list2 = new ArrayList<String>();
//		String s = sc.next();
		int answer = 0;
		int n = Integer.parseInt(sc.next());
		int v1 = 0;
		int v2 = 0;
		int tnum1 = 0;
		int tnum2 = 0;
		String s = "";
		Boolean b = false;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for(int i = 0;i < n;i++){
			list.add(Integer.parseInt(sc.next()));
		}
		
		for(int i = 0;i < n;i+=2){
			int count = 0;
			v1 = list.get(i);		
			for(int h = 0;h <= n/2;h+=2){
				if(v1 == list.get(h)){
					count += 1;
				}			
			}
			if(count2 <= count){
				count2 = count;
				tnum1 = list.get(i);
			}else if(count2 == 0){
				count2 = count;
				tnum1 = list.get(i);
			}
		}
		for(int i = 1;i < n;i+=2){
			int count = 0;
			v2 = list.get(i);		
			for(int h = 0;h <= n/2;h+=2){
				if(v2 == list.get(h)){
					count += 1;
				}			
			}
			if(count3 <= count){
				count3 = count;
				tnum2 = list.get(i);
			}else if(count3 == 0){
				count3 = count;
				tnum2 = list.get(i);
			}
		}
		for(int h = 0;h <= n/2;h+=2){
			if(tnum1 != list.get(h)){
				count4 += 1;
			}			
		}
		for(int h = 1;h <= n/2;h+=2){
			if(tnum2 != list.get(h)){
				count4 += 1;
			}			
		}
		System.out.println(count4);
		System.out.flush();
		sc.close();
	}
}