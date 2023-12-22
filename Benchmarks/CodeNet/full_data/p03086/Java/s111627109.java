import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    int max = 0;
    for(int i=0 ; i<s.length() ; i++){
      if(s.charAt(i)=='A' || s.charAt(i)=='C' || s.charAt(i)=='G' || s.charAt(i)=='T'){
        count++;
        max = Math.max(count,max);
      }else{
        count=0;
      }
    }
    System.out.println(max);
  }
}
