import java.util.*;
public class Main{
  static long gcd (long a, long b) {
	long r;
	while((r = a%b)!=0) {
		a = b;
		b = r;
	}
	return b;
}
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int K=sc.nextInt();
    long x=0;
    for(int i=1;i<K+1;i++){
      for(int j=1;j<K+1;j++){
        for(int k=1;k<K+1;k++){
          long t =gcd(j,k);
           x =x+gcd(i,t);
        }
      }
    }
    System.out.println(x);
  }
}