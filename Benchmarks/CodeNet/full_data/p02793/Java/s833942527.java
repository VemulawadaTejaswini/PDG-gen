import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int p = 1000000007;

    int n = nextInt();
    long[] a = new long[n];

    long ue = 1;
    long sum = 0;

    for(int i=0;i<n;i++){
      a[i] = nextLong();

      ue *= a[i];
      ue %= p;

      sum += pinv(a[i],p,p);
      sum %= p;

    }

    long shita = a[0];
    for(int i=0;i<n;i++){
      shita = gcd(shita,a[i]);
    }
    shita %= p;

    long lcmP = (ue*pinv(shita,p,p))%p;

    long ans = (lcmP*sum)%p;

    System.out.println(ans);


  }

  static long pmult(long a,long b,long p){
    return (a * b) % p;
  }

  static long pinv(long a, long b, long p){
    long r0 = a; long r1 = b;
    long x0 = 1; long x1 = 0;
    long y0 = 0; long y1 = 1;
    while(r1>0){
      long q = r0/r1;
      long r2 = r0 % r1;
      long x2 = x0 -pmult(q,x1,p)+p;
      x2 %= p;
      long y2 = y0 -pmult(q,y1,p)+p;
      y2 %= p;
      r0 = r1; r1 = r2;
      x0 = x1; x1 = x2;
      y0 = y1; y1 = y2;
    }
    return x0;
  }

  static long lcm(long a,long b){
    return (a * b / gcd(a,b));
  }

  static long gcd(long a,long b){

    if(a%b!=0){
      return gcd(b,a%b);
    }
    else{
      return b;
    }

  }

  /*
    static String toSmall(String s){
      char c = s.charAt(0);
      //if(Character.isUpperCase(c)){
      if(c<=90){
        c += 32;
      }
      return String.valueOf(c);
    }
    static String toBig(String s){
      char c = s.charAt(0);
      //if(Character.isLowerCase(c)){
      if(c>=97){
        c -= 32;
      }
      return String.valueOf(c);
    }
  */

  static String toSmall(String s){
    return s.toLowerCase();
  }

  static String toBig(String s){
    return s.toUpperCase();
  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char a){
    return a - 48;
  }

////////////////////////////////////////////
  public static int max(int[] a){
    int lng = a.length;
    int max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
  public static long max(long[] a){
    int lng = a.length;
    long max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
////////////////////////////////////////////

////////////////////////////////////////////
  public static int min(int[] a){
    int lng = a.length;
    int min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
  public static long min(long[] a){
    int lng = a.length;
    long min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
////////////////////////////////////////////

}
