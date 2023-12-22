import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int r = 1;
    char c = S.charAt(0);
    for(int i =1;i<N;i++){
      if(S.charAt(i)!=c){
        c=S.charAt(i);
        r++;
      }
    }
    System.out.println(r);
  }
}