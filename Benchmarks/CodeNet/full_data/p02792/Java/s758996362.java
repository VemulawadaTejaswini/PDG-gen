import java.util.*;
import java.lang.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int cnt = 0;
    for (int a = 1; a <= n; a++) {
        String astr = a + "";
        String as = astr.substring(0, 1);
        String ae = astr.substring(astr.length() - 1, astr.length());
        for (int b = 1; b <= a; b++) {
            String bstr = b + "";
            String bs = bstr.substring(0, 1);
            String be = bstr.substring(bstr.length() - 1, bstr.length());
            if (as.equals(be) && bs.equals(ae)) {
                cnt++;
                if (a != b) cnt++;
            }
        }
    }
    System.out.println(cnt);
  }
}
