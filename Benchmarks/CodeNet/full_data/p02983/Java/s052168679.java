import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      long min1 = 2000000000;
      long min2 = 2000000000;
      long num;
      int cnt = 0;
      for(long i = l; i <= r; i++) {
        cnt++;
        num = i%2019;
        if(num < min2) {
          min2 = num;
          if(num == 0) {
            break;
          }
        }
        if(num < min1) {
          min2 = min1;
          min1 = num;
        }
        if (cnt == 2019) 
          break;
      }
      System.out.println((min1*min2)%2019);
	}
}