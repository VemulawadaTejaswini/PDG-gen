import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      String S = sc.next();
      int K = Integer.parseInt(sc.next());
      
      char c = S.charAt(K-1);
      char[] Slist = S.toCharArray();
      
      for(int i=0; i<N; i++){
        if (Slist[i] != c) Slist[i] = '*';
      }
      String string = new String(Slist);
      System.out.println(string);
    }
}