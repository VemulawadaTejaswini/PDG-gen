import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int page = 0;
    int gaze = -1;
    int tl=t.length();
    int will;
    for(int i=0;i<tl;i++){
      if((will=s.indexOf(t.charAt(i),gaze+1))==-1){
        if((will=s.indexOf(t.charAt(i)))==-1){
          System.out.println(-1);
          return;
        }
        page++;
      }
      gaze=will;
    }
    System.out.println(((long)page)*s.length()+gaze+1);
  }
}