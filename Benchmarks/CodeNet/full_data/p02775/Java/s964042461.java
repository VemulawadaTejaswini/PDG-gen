import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      String N = sc.next();
      int Nl = N.length();
      long count = 0;
      for(int i=0;i<Nl;i++){
        String p = N.substring(i, i+1);
        if("0".equals(p)){
          
        }
        if("1".equals(p)){
          count++;
        }
        if("2".equals(p)){
          count+=2;
        }
        if("3".equals(p)){
          count+=3;
        }
        if("4".equals(p)){
          count+=4;
        }
        if("5".equals(p)){
          count+=5;
        }
        if("6".equals(p)){
          count+=5;
        }
        if("7".equals(p)){
          count+=4;
        }
        if("8".equals(p)){
          count+=3;
        }
        if("9".equals(p)){
          count+=2;
        }
      }

      System.out.println(count);


    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
