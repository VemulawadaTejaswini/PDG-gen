import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    char c1[] = new char[3];
    char c2[] = new char[3];
    for(int i=0 ; i<3 ; i++){
      c1[i] = s1.charAt(i);
      c2[i] = s2.charAt(i);
    }
    if(c1[1]==c2[1] && c1[0]==c2[2] && c1[2]==c2[0]){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
