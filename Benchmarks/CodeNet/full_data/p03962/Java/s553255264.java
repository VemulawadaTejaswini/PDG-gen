import java.util.*;
/**
 * AtCoder Beginner Contest 044
 * 
 * 
 * @author stmasa2016
 *
 */
public class Main {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] inArray = in.split(" ");
		List <String> strList = new ArrayList<String>();
		
		for (int i = 0; i < inArray.length; i++) {

			if (strList.contains(inArray[i])) {
				continue;
			} else {
				strList.add(inArray[i]);
			}
		}


		System.out.println(strList.size());
	}
	

	
}