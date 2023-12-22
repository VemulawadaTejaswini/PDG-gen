import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = sc.nextLong();
      long countC = 1;
      long countD = 1;
      long countCD = 1;
      for(int i = a;i <= b;i++){
      	if(i%c==0){
            countC += (b-i+1)%c;
            break;
        }
      }
      for(int i = a;i <= b;i++){
      	if(i%d==0){
        	countD += (b-i+1)%d;
            break;
        }
      }
      for(int i = a;i <= b;i++){
      	if(i%c==0 && i%d==0){
        	countCD += (b-i+1)%(c*d/gcd(c,d));
            break;
        }
      }
      System.out.println(b-a+1-(countC+countD-countCD));
    }
  　　private static long gcd(long m, long n) {
    	if(m < n) return gcd(n, m);
    	if(n == 0) return m;
    	return gcd(n, m % n);
    }
}
}
