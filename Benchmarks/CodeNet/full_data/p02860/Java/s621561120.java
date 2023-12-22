import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String line = sc.nextLine();
		String result = "";
		if(line.length()%2 == 1) {
			result = "No";
		}else {
			int halfPoint = line.length()/2;
			String priStr = line.substring(0, halfPoint);
			String endStr = line.substring(halfPoint,line.length());
			if(priStr.equals(endStr)) {
				result = "Yes";
			}else {
				result = "No";
			}
		}
		System.out.println(result);
		
		
	}
}