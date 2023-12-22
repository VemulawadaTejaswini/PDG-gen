import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),o=0,e=0,buff=0;
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++) {
    	buff=sc.nextInt();
    	if(buff%2==0)e++;
    	else o++;
    	set.add(buff);
    }
    if(set.size()==1) {
    	System.out.println(buff);
    }else {
    	if(o==0) {
    		System.out.println(2);
    	}else {
    		System.out.println(1);
    	}
    }
  }
}
