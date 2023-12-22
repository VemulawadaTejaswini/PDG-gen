import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int win = 0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='o'){
        win++;
      }
    }
    win+=15-s.length();
    System.out.println(win<8?"NO":"YES");
  }
}