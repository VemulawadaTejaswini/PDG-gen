import java.util.*;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    boolean first = false;
    boolean end = false;
    int a = S / 100;
    if(a >= 1 && a <= 12) first = true;
    int b = S % 100;
    if(b >= 1 && b <= 12) end = true;
    String ans;
    if(first == true && end == true) ans = "AMBIGUOUS";
    else if(first == false && end == true) ans = "YYMM";
    else if(first == true && end == false) ans = "MMYY";
    else ans = "NA";
    System.out.println(ans);
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}