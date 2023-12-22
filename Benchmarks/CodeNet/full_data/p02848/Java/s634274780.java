import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char c[] = s.toCharArray();
    int a = 0;
    for(int i=0 ; i<s.length() ; i++){
      a = (int)c[i]+n;
      if(a<=90){
        System.out.print((char)a);
      }else{
        System.out.print((char)(a-90+64));
      }
    }
    System.out.println();
  }
}
