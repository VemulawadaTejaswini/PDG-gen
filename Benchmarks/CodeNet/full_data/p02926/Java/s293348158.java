import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力

	int N = sc.nextInt();
      int[] x = new int[N];
      int[] y = new int[N];
      long xxx =0;
      long yyy =0;
      double max=0;
      double maxx=0;
for(int j=0;j<N;j++){
  x[j]=sc.nextInt();
  y[j]=sc.nextInt();
  xxx=xxx+x[j];
  yyy=yyy+y[j];
}
      max=sqrt(xxx*xxx+yyy*yyy);
      Map<Integer, Integer> map = new HashMap<>();
      int i=0;
      boolean flg =true;
      int tmp=-1;
      for(;flg;){
      	flg =false;
		for(i=0;i<N;i++){
  			if(!map.containsKey(i)){
  				maxx = sqrt((xxx-x[i])*(xxx-x[i])+(yyy-y[i])*(yyy-y[i]));
              	if(maxx >max){
                	max =maxx;
                	tmp=i;
              	}
            }
		}
        if(tmp>-1){
          map.put(tmp, 0);
          xxx=xxx-x[tmp];
          yyy=yyy-y[tmp];
          flg =true;
          tmp =-1;
        }
      }
      System.out.println(max);

    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
  
      public static double sqrt(double a){
        double x = a;
        for(int i = 0; i < 1000; ++i){
            x = x - (x * x - a) / (2 * x);
        }
        return x;
    }
}