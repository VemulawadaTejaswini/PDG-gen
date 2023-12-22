import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int left = 0, right = n - 1;
      while(true) {
        System.out.println(left);
        String ansL = sc.next();
        if(ansL.equals("Vacant")) return;

        System.out.println(right);
        String ansR = sc.next();
        if(ansR.equals("Vacant")) return;

        int mid = left + (right - left) / 2;
        System.out.println(mid);
        String ansM = sc.next();
        if(ansM.equals("Vacant")) return;
        if(ansM.equals(ansL) && (mid - left) % 2 == 1 || !ansM.equals(ansL) && (mid - left) % 2 == 0) {
          right = mid;
        } else left = mid;
      }
  }
}