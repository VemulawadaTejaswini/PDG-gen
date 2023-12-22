import java.util.*;
 
public class Main{
  static int N;
  static Set<Long> set;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    N = Integer.parseInt(sc.nextLine());
    set = new HashSet<>();
    
    long n = 0;
    func(n);
    System.out.println(set.size());
  }
  public static void func(long n){
    if(n > N){
      return;
    }
    boolean c3 = false;
    boolean c5 = false;
    boolean c7 = false;
    String s = n + "";
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '3'){
        c3 = true;
      }else if(s.charAt(i) == '5'){
        c5 = true;
      }else if(s.charAt(i) == '7'){
        c7 = true;
      }
    }
    if(c3 && c5 && c7){
      set.add(n);
    }
    
    func(n*10+3);
    func(n*10+5);
    func(n*10+7);
  }
}