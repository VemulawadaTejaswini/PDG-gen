import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    long N = s.nextLong();
    ArrayList<String> str = new ArrayList<String>();
    ArrayList<Character> cha = new ArrayList<Character>();
    long Ans = 0;
    String a = new String();
    for (long i=0;i<N;i++){
      a = s.next();
        for(int j=0;j< a.length();j++){
          cha.add(a.charAt(j));
        }
      Collections.sort(cha);
      a = cha.toString();
      str.add(a);
      cha.clear();
    }
    Collections.sort(str);
    int REN = 0;
    for (int i=0; i<N-1;i++){
      String ha = str.get(i);
      if (ha.equals(str.get(i+1))){
        REN += 1;
        Ans += REN;
      }
      else{
        REN = 0;
      }
    }
    System.out.println(Ans);
  }
}