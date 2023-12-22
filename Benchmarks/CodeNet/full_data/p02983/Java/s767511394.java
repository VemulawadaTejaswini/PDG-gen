import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      long min1 = 2000000000;
      long min2 = 2000000000;
      long num;
      
      if(l+(2019-(l%2019)) > r) {
        System.out.println(((l%2019)*((l%2019)+1)%2019));
      } else {
                             System.out.println(0);
                           }

    
    }
}