import java.util.*;
public class Main {
    static int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int output = 0;
      int N = sc.nextInt();
      int M = sc.nextInt();
      if(Math.abs(N - M) >= 2){
        System.out.println(output);
      }else if(Math.abs(N - M) == 1){
        System.out.println((fact(N) * fact(M)) % MOD);
      }else{
        //最後に2倍
        //System.out.println(fact(N));
        //System.out.println(fact(M));
        System.out.println(((fact(N) * fact(M)) % MOD) * 2 % MOD);
      }
	}
  
  public static Long fact(int a){
    Long ret = new Long(1);
    for(int i = 1; i <= a; i++){
      ret = (ret * i) % MOD;
    }
    return ret;
  }
}
