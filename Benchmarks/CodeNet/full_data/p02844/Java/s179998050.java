import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      String S = sc.next();
      String[] sA = new String[N];
      for(int i=0;i<N;i++){
        sA[i]=S.substring(i,i+1);
      }
      Map<String,Integer> map = new HashMap<>();
      int s1=0;
      int s2=1;
      int s3=2;
      StringBuilder sb = new StringBuilder("");
	  for(s1=0;s1<N-2;s1++){
        for(s2=s1+1;s2<N-1;s2++){
         for(s3=s2+1;s3<N;s3++){
           sb = new StringBuilder(sA[s1]);
           sb.append(sA[s2]);
           sb.append(sA[s3]);
           map.put(sb.toString(),0);
         }
        }
      }
      System.out.println(map.size());
      

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
