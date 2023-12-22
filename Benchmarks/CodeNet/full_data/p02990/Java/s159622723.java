import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	long N = sc.nextLong();
    long K = sc.nextLong();
    long kazu = 0;
    long a=0;
    long b=0;
for(long i=0;i<K;i++){
  kazu=0;
  if(i==0){
    kazu = N-K+1;
  }else{
    a=0;
  for(a=0;a<N-K-i+1;a++){
    b=N-K-a;
    kazu= (kazu+(acn(K-1,i)%100000007)*((a+1)*acn(b-1,i-1)) %100000007)%100000007;

    }
  }
  System.out.println(kazu);
}
}
  
  private static long acn(long a, long n) {
if(a<n){
  return -1;
}
    return kaijou(a)/kaijou(n)/kaijou(a-n);
}

  
private static long kaijou(long n) {
    if(n<2){
      return 1; 
    }
    return n*kaijou(n-1);
}

  
}