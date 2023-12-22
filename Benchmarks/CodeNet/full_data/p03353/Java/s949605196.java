import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine();
		  int K = sc.nextInt();
		  sc.close();
		  
		  List<String> list = new ArrayList<>();
	
		  for(int i = 0; i < s.length(); i++) {
			  for(int j = 0; j < Math.min(K, s.length() - i); j++) {
				  if(!list.contains(s.substring(i, i + j + 1))) {
					  list.add(s.substring(i, i + j + 1));
				  }
			  }
		  }
		  
		  Collections.sort(list);
		  
		  System.out.println(list.get(K - 1));
	      System.exit(0);
	    }
}