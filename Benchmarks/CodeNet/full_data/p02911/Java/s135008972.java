import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] ls = line.split(" ");
    int people = Integer.parseInt(ls[0]);
    int first_pt = Integer.parseInt(ls[1]);
    int count = Integer.parseInt(ls[2]);
    HashMap<Integer, Integer> pointmap = new HashMap<Integer, Integer>();
    for(int i = 0; i < people; i++) {
    	pointmap.put(i + 1, first_pt);
    }

    for(int i = 0; i < count; i++) {
    	String p = sc.nextLine();
    	int pp = Integer.parseInt(p);
    	for(int i2 = 0; i2 < people; i2++) {
    		if(pp != (i2 + 1)) {
    			pointmap.put(i2 + 1, pointmap.get(i2 + 1) - 1);
    		}
    	}
    }

    for(int i = 0; i < people; i++) {
    	if(pointmap.get(i + 1) > 0) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }

  }
}