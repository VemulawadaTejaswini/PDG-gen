import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    long ans=0;
    boolean du=false;
    StringBuilder sb=new StringBuilder(s.length());
    for(int i=s.length()-1;i>=0;i--){
      int d=s.charAt(i)-'0';
      if(du){
        d++;
      }
      int su=d;
      int iv=10-d;
      if(su<iv+1){
        ans+=su;
        du=false;
        sb.insert(0,String.valueOf(su));
      }else{
        ans+=iv;
        du=true;
        sb.insert(0,"0");
      }
    }
    if(du){
      ans++;
      sb.insert(0,"1");
    }
    System.out.println(ans);
  }
}
