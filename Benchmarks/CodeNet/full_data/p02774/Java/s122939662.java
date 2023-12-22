import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int n = nextInt();
    long k = nextLong();
    long[] a = new long[n];
    long minus = 0;
    long zero = 0;
    long plus = 0;
    for(int i=0;i<n;i++){
      a[i] = nextLong();
      if(a[i]<0){
        minus++;
      }
      else if(a[i]==0){
        zero++;
      }
      else{
        plus++;
      }
    }

    //積がマイナスは(minus×plus)個
    //積がプラスは(minusC2)+(plusC2)個
    //積が0は{(minus+plus)×zero}+(zeroC2)個

    long minusAf = (minus*plus);
    long plusAf = (minus*(minus-1)/2) + (plus*(plus-1)/2);
    long zeroAf = (n-zero)*zero + (zero*(zero-1)/2);

    if(k<=minusAf){
      //答えはマイナス
    }
    else if(k<=(minusAf+zeroAf)){
      //答えはゼロ
      System.out.println("0");
    }
    else{
      //答えはプラス
    }

    //System.out.println();

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
