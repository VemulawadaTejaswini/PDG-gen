import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      long min1 = 2000000000;
      long min2 = 2000000000;
      long num;
      
      boolean ans3 = false;
      // 673で割れるか
      if(l%3 == 0) {
        ans3 = true;
      }else      if(l+(3-(l%3)) <= r) {
        ans3 = true;
                           }
      boolean ans673 = false;
      // 673で割れるか
      if(l%673 == 0) {
        ans673 = true;
      }else      if(l+(673-(l%673)) <= r) {
        ans673 = true;
                           }
      
      boolean ans2019 = false;
      // 2019で割れるか
      
      if(l%2019 == 0) {
        ans2019 = true;
      }else       if(l+(2019-(l%2019)) <= r) {
        ans2019 = true;
                           }
      if(ans3 && ans673) {
        System.out.println(0);
      }else if(ans2019) {
        System.out.println(0);
      } else {
        System.out.println(((l%2019)*((l+1)%2019)%2019));
      }

    
    }
}