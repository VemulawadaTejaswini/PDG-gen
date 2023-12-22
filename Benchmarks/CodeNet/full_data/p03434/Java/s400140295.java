import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//  B - Card Game for Two

public class Main {
  public static void main(String[] args ) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    List<Integer> list = new ArrayList();

    for(int i = 0; i < n ; i++) {
    	list.add(Integer.parseInt(sc.next()));
    }

    int alice = 0;
    int bob = 0;

    boolean flg = true;
    Collections.sort(list);
    Collections.reverse(list);
    for(Integer a : list) {
    	if(flg) {
    		alice += a;
    		flg = false;
    	} else {
    		bob += a;
    		flg = true;
    	}
    }

    	System.out.println(alice-bob);
  }
}

