import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    
    char[] c = Burger(n).substring(0, x).toCharArray();
    int eat = 0;
    for(int i=0; i<x; i++){
      if(c[i]=='p'){
        eat++;
      }
    }

    System.out.println(eat);

  }

  public static String Burger(int N){
    if(N==0){
      return "p";
    }else{
      return "B" + Burger(N-1) + "p" + Burger(N-1) + "B";
    }
  }
}