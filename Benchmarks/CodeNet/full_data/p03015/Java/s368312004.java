import java.util.*;
public class Main{
  	public static long power(long x,long y){
      if (y == 0) {
        return 1; 
      }
      long a = power(x,y/2)%1000000007;
      if (y % 2 == 0) {
          return  ((a %1000000007)*(a %1000000007))%1000000007;
      }
      else{
          return ((x%1000000007)*(a%1000000007)*(a%1000000007))% 1000000007; 
      }
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.next().split("");
      	long total = 0;
      	long m = 1000000007;
      	long mt = 1;
      	for (int i=0;i<s.length;i++){
          if (s[i].equals("1")){
            total = (total%m+(mt%m*power(3,s.length-i-1)%m)%m)%m;
            mt = mt*2;
          }
        }
      	System.out.println(total+mt);
	}
}