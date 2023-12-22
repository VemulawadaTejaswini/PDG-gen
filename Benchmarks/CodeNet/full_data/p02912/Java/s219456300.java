import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //値段高い順にソートして、一番高いやつに一回使って変化後をキープ、繰り返す。
    int N = sc.nextInt();
    int M = sc.nextInt();
    long A[] = new long[N];
    long answer =0;
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }
    List<Long> price = new ArrayList<Long>();
    for(int i=0;i<N;i++){
      price.add(A[i]);
    }
    for(int i=0;i<M;i++){
      long j = Collections.max(price);
//      System.out.println(j);
      int k = price.indexOf(j);
      price.remove(k);
      price.add(j/2);
    }
    for(long tmp : price){
      answer += tmp;
    }
    System.out.println(answer);
  
    
    
  }
  
  //最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}


//素数判定
static boolean isPrime (int n) {
	if (n==2) return true;
	if (n<2 || n%2==0) return false;
	double d = Math.sqrt(n);
	for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
	return true;
}


//倍数判定（10進数以外のときに有用）
static boolean isMultiple (String s, int base, int m) {
	int temp = 0;
	for (int i=0; i<s.length(); i++) {
		temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
	}
	if (temp==0) {return true;}
	return false;
}


//階乗
static long factorial (int i) {
	if (i==1) {return 1;}
	else {return i*factorial(i-1);}
}


//進数変換
static String toNbase (String sm, int m, int n) {
	return Long.toString(Long.parseLong(sm,m),n);
}
  
}