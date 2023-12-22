import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    String s=sc.next();
    String t=sc.next();
    final int wakeru = 100000;
    String[] ss = new String[(s.length()+wakeru-1)/wakeru];
    for(int i=0;i<ss.length;i++){
      ss[i]=s.substring(wakeru*i,Integer.min(wakeru*(i+1),s.length()));
    }
    boolean[][] exist = new boolean['z'-'a'+1][ss.length];
    for(int i='a';i<='z';i++){
      for(int j=0;j<ss.length;j++){
        exist[i-'a'][j]=(ss[j].indexOf(i)!=-1);
      }
    }
//    System.out.println(Arrays.deepToString(exist));
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
    System.out.println(page*s.length()+((long)sect*wakeru)+gaze+1);
    
    
  }
}