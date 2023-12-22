import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int n = nextInt();

    String P = "";
    for(int i=0;i<n;i++){
      P += next();
    }

    String Q = "";
    for(int i=0;i<n;i++){
      Q += next();
    }

    String R = "";
    for(int i=0;i<n;i++){
      R += String.valueOf(i+1);
    }

    int a = 0;
    int b = 0;

    int cnt = 1;

    while(true){
      if(P.equals(R)){
        a = cnt;
      }
      if(Q.equals(R)){
        b = cnt;
      }

      R = nextPermutation(R);
      cnt++;

      if(R.equals("Final")){
        break;
      }
    }

    System.out.println(Math.abs(a-b));

  }

  public static String nextPermutation (String s) {

   ArrayList<Character> list = new ArrayList<>();
   for(int i=0;i<s.length();i++){
     list.add(s.charAt(i));
   }

   int pivotPos = -1;
   char pivot = 0;
   for(int i=list.size()-2;i>=0;i--){
     if(list.get(i)<list.get(i+1)){
       pivotPos = i;
       pivot = list.get(i);
       break;
     }
   }

    if(pivotPos==-1 && pivot==0){
      return "Final";
    }

    int L = pivotPos+1, R = list.size()-1;
    int minPos = -1;
    char min = Character.MAX_VALUE;
    for(int i=R;i>=L;i--){
      if(pivot<list.get(i)){
        if(list.get(i)<min){
          min = list.get(i);
          minPos = i;
         }
       }
    }

     Collections.swap(list, pivotPos, minPos);
     Collections.sort(list.subList(L, R+1));

     StringBuilder sb = new StringBuilder();
     for(int i=0;i<list.size();i++){
       sb.append(list.get(i));
     }

     return sb.toString();
   }

  static int lcm(int a,int b){
    return a*b*gcd(a,b);
  }

  static int gcd(int a,int b){
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
