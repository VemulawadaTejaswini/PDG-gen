import java.util.*;

//update 2019/12/29

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = nextInt();  int Q = nextInt();
    String[] S = splitString(next()); //n == S.length()

    for(int i=0;i<Q;i++){
      int l = nextInt()-1;
      int r = nextInt()-1;
      // s[l]-s[r]

      int ans = 0;

      for(int j=l+1;j<=r;j++){
        if(S[j-1].equals("A") && S[j].equals("C")){
          ans++;
        }
      }

      System.out.println(ans);

    }

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

  static int charToInt(char aaa){
    return aaa - 48;
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
