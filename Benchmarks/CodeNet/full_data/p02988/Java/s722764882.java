import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberCount = Integer.parseInt(sc.nextLine());
		String[] line = sc.nextLine().split(" ");
		List list = Arrays.asList(line);
		int result = 0;
		for(int i = 1;i<=numberCount-2;i++) {
			List tmp = new ArrayList(list.subList(i-1,i+2));
			Collections.sort(tmp);
			if(list.get(i) == tmp.get(1)) {
				result++;
			}
		}
		System.out.println(result);
	}
}
	
	