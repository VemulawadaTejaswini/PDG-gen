import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		Map<String,String> list=new HashMap<String,String>();
		
		list.put("Sunny","Cloudy");
		list.put("Cloudy","Rainy");
		list.put("Rainy","Sunny");
		
		String str=scn.next();
		
		if(str.contains("Sunny")) {
			System.out.println(list.get(str));
		}
		if(str.contains("Cloudy")) {
			System.out.println(list.get(str));
		}
		if(str.contains("Rainy")) {
			System.out.println(list.get(str));
		}
		
		scn.close();
	}
}