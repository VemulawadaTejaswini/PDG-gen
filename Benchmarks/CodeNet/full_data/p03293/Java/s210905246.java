import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    char[] c1 = s.toCharArray();
    char[] c2 = t.toCharArray();

    int l = c1.length;
    boolean flag = false;

    for(int i=0; i<=l-1; i++ ){
      int count = 0;
      for(int j=0; j<l; j++){
        if(c1[(j+i)%l] == c2[j]){
          count += 1;
        }else{
          break;
        }
      }
      if(count == l){
        flag = true;
        break;
      }
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}