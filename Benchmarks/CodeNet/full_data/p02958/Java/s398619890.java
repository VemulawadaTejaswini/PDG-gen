
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scan = new Scanner(System.in);
	     int r  = scan.nextInt();
	     ArrayList<Integer> list = new ArrayList<Integer>();
	     for(int i=0;i<r;i++) {
	    	 list.add(scan.nextInt());
	     }

	     List sorted = (List) list.clone();
	     Collections.sort(sorted);
	     int c=0;
	     for(int i=0;i<list.size();i++) {
	    	 if(list.get(i) != sorted.get(i)){
	    		 c++;
	    		 if(c>=2) {
	    			 System.out.println("No");
	    		 }
	    	 }

	     }
		 System.out.println("YES");


	}

}
