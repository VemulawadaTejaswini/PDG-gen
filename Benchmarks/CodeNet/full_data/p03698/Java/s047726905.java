import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String c[] = new String[S.length()];
    for(int i=0;i<S.length();i++){
      c[i]=S.substring(i,i+1);
    }
    Arrays.sort(c);
    for(int i=0;i<S.length()-1;i++){
      if(c[i].equals(c[i+1])){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
  

  
}
