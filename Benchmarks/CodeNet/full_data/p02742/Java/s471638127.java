import java.util.*;

public class Main {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans=0;
    if (a * b % 2==0){
    	ans = a * b/2;
    } else {
    	ans = a* b/2 +1;
    }
      if (a == 1 || b == 1) {
    System.out.println(1);

      }else{
    System.out.println(ans);
      }
    }


}


