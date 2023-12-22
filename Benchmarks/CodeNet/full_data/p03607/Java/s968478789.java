import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    Set<Long> set=new HashSet<>();
    for(int i=0;i<n;i++) {
    	long buff=sc.nextLong();
    	if(!set.add(buff)) {
    		set.remove(buff);
    	}
    }
    System.out.println(set.size());
  }
}
