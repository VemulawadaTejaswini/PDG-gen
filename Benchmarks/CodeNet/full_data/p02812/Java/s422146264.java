import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String t = scan.next();
    int count = 0;
    for (int i=0;i<n-2;i++){
      if ((t.charAt(i) == 'A') && (t.charAt(i+1) == 'B') && (t.charAt(i+2) == 'C')){
        count += 1;
      }
    }
    System.out.println(count);
  }
}
