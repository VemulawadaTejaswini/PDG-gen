import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int s = -1;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'A'){
        s = i;
        break;
      }
    }
 
    int t = -1;
    for(int i = str.length() - 1; i >= 0; i--){
      if(str.charAt(i) == 'Z'){
        t = i;
        break;
      }
    }
 
    System.out.println((t - s) + 1);
    sc.close();
  }
}
