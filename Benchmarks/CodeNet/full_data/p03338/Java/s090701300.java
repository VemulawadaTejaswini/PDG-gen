import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String s = sc.nextLine();
		
		int max = 0;
		for(int i=1; i< s.length(); i++) {
			int tmp = 0;
			String x = s.substring(0, i);
			String y = s.substring(i);
			
			Set<String> xList = new HashSet<>(Arrays.asList(x.split("")));
			Set<String> yList = new HashSet<>(Arrays.asList(y.split("")));
			
			for(String a : xList) {
				if(yList.contains(a))
					tmp++;
					
			}
			if(max < tmp)
				max = tmp;
		}
		
		System.out.println(max);
	}
		
}
