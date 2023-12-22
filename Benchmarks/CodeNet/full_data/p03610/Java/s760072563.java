import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    char[] a = s.toCharArray();
    String ans = "";
    for(int i=0; i<a.length; i++){
      if(i%2 == 0){
        ans += a[i];
      }
    }
    System.out.println(ans);

    sc.close();
  }
}
