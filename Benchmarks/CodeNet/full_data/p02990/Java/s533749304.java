import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long cnt =0;
      long N = sc.nextInt();
      long K = sc.nextInt();
      
      for(long i=1;i<K+1;i++) {
    	  if (i == 1) {
        	  cnt = ( calcNumOfCombination(N-K+1,i) ) % 1000000007;    		  
    	  } else {
        	  cnt = ( calcNumOfCombination(N-K+1,i) * calcNumOfCombination(K-1,i-1) ) % 1000000007;
    	  }
    	  System.out.println(cnt);
      }
      

  }
  
  
 //組み合わせの数nCrを計算
  static long calcNumOfCombination(long n, long r){
	  double wk = 1;
	  for(long i=0; i<r; i++) {
		  wk = (wk * (n-i) / (r-i)) % 1000000007;
	  }
    return (long) Math.round(wk);
}
//nの階乗を計算
static long factorial(long n){
    long answer = 1;
while(n > 1){
    answer *= n;
    n--;
}
    return answer;
}  
//nPrの計算
static long Parmitation(long n, long r){
	  double wk = 1;
	  for(long i=0; i<r+1; i++) {
		  wk = (wk * (n-i)) % 1000000007;
	  }
//   	  System.out.println("n=" + n + " r=" + r + " wk=" + wk);
   	  if(wk==0) wk=1;
   	   return (long) Math.round(wk);
}

}
