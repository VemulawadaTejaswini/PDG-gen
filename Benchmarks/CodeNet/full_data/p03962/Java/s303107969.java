import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int ans = 3;
    if(a == b){
      ans--;
    }
    if(a == c){
      ans--;
    }
    System.out.println(ans);
  }
}