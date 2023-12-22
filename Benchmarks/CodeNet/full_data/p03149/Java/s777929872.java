import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	int c = sc.nextInt();
	    	int d = sc.nextInt();
	    	List<Integer> list = new ArrayList<>();
	    	list.add(a);
	    	list.add(b);
	    	list.add(c);
	    	list.add(d);
	    	Collections.sort(list);
	    	if (list.get(0) == 1 && list.get(1) == 4 && list.get(2) == 7 && list.get(3) == 9) {
	    		System.out.println("YES");
	    	} else {
	    		System.out.println("NO");
	    	}
	}
}
