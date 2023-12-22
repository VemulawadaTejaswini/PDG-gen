import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int k = sc.nextInt();
      String S = sc.next();
      char[] c = new char[N];

      for(int i = 0;i<N;i++){
        c[i] = S.charAt(i);
      }

      if(c[k-1]=='A'){
        c[k-1]='a';
      }
      if(c[k-1]=='B') {
        c[k-1]='b';
      }
      if(c[k-1]=='C') {
        c[k-1]='c';
      }

      for(int i = 0;i<N;i++){
        System.out.print(c[i]);
      }
      System.out.println();

  }
}