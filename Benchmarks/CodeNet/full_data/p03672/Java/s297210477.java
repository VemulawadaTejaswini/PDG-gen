import java.util.*;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int x = 0;

    for(int i = s.length()-1;i > 0;i--){
      s = s.substring(0,i);
      String s1 = s.substring(0,i/2);
      String s2 = s.substring(i/2,i);

      if(s1.equals(s2)){
        x = i;
        break;
      }
    }

    System.out.println(x);

  }

}
