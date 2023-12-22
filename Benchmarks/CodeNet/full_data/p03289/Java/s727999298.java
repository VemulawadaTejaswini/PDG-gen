import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    boolean flg1 = searchA(s);
    //System.out.println(flg1);
    boolean flg2 = searchC(s);
    //System.out.println(flg2);
    boolean flg3 = searchLowcase(s);
    //System.out.println(flg3);

    if(flg1 && flg2 && flg3) System.out.println("AC");
    else System.out.println("WA");

  }

  private static boolean searchA(String s){
    if(s.charAt(0) == 'A') return true;
    else return false;
  }

  private static boolean searchC(String s){
    int sum = 0;
    for (int i = 2; i < s.length()-1; i++) {
      int result = s.indexOf("C", i);
      //System.out.println(i +":"+ result);
      if (result != -1) sum++;
    }
    if(sum==1) return true;
    else return false;
  }

  private static boolean searchLowcase(String s){
    String lows = s.replace("A", "").replace("C", "");
    return lows.equals(lows.toLowerCase());
  }

}
