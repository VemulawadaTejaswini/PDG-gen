import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();
    List<Integer> list = new ArrayList<Integer>();
    for(long i=1;i<=Math.sqrt((double)n);i++) {
    	if(n%i == 0) {
        	if(!list.contains(f(i,n/i))) {
        		list.add(f(i,n/i));
        	}
    	}
    }
    Collections.sort(list);
    System.out.println(list.get(0));
  }
  private static int f(long a, long b) {
	  return Math.max((int)(Math.log10(a))+1, (int)(Math.log10(b))+1);
  }
}