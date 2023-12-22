import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    String s=sc.next();
    String t=sc.next();
    
    String[] ss = new String[(s.length()+1999)/2000];
    for(int i=0;i<ss.length;i++){
      ss[i]=s.substring(2000*i,Integer.min(2000*(i+1),s.length()));
    }
    boolean[][] exist = new boolean['z'-'a'+1][ss.length];
    for(int i='a';i<='z';i++){
      for(int j=0;j<ss.length;j++){
        exist[i-'a'][j]=(s.indexOf(i)!=-1);
      }
    }
    
    long page=0;
    int sect=0;
    int gaze=-1;
    
    for(int i=0;i<t.length();i++){
      int will=-1;
      if(exist[t.charAt(i)-'a'][sect]){
        will=ss[sect].indexOf(t.charAt(i),gaze+1);
      }
      if(will==-1){
        for(int j=sect+1;j<ss.length;j++){
          if(exist[t.charAt(i)-'a'][j]){
            sect=j;
            will=ss[sect].indexOf(t.charAt(i));
            break;
          }
        }
      }
      if(will==-1){
        for(int j=0;j<=sect;j++){
          if(exist[t.charAt(i)-'a'][j]){
            page++;
            sect=j;
            will=ss[sect].indexOf(t.charAt(i));
            break;
          }
        }
        if(will==-1){
          System.out.println(-1);
          return;
        }
      }
      gaze=will;
    }
    System.out.println(page*s.length()+sect*2000+gaze+1);
    
    
  }
}