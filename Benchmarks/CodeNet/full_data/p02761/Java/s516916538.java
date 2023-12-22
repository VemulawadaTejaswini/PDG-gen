import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main {
  
  static int N,M;
  
  static List<Integer> s = new ArrayList<>();
  static List<Integer> c = new ArrayList<>();
  
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   N = scanner.nextInt();
   M = scanner.nextInt();
   for(int i = 0;i < M;i++){
     s.add(scanner.nextInt());
     c.add(scanner.nextInt());
   }
   System.out.println(solve());
 }
  
  public static String solve(){
    for(int i = 0;i < 1000;i++){
      String str = String.valueOf(i);
      if(ok(str))return str;
    }
    return "-1";
  }
  
  public static boolean ok(String str){
    if(str.length() != N) return false;
    for(int i = 0;i < M;i++){
      if(str.charAt(s.get(i) - 1) != (char)((int)c.get(i) + '0')) return false;
    }
    return true;
  }
}