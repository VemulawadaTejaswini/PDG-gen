import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt();
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++) {
    	int buff=sc.nextInt();
    	set.add(buff);
    }
    System.out.println((int)Math.max(0,k-set.size()));
  }
}
