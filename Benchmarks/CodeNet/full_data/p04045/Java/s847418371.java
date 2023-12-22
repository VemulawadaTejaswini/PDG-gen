import java.util.*;

class Main{
  static String s;
  static int n;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    boolean[] ngn=new boolean[10];
    for(int i=0;i<k;i++){
      ngn[sc.nextInt()]=true;
    }
    while(true){
      String gaku=String.valueOf(n);
      boolean flag=true;
      for(int i=0;i<gaku.length();i++){
        if(ngn[gaku.charAt(i)-'0']){
          flag=false;
          break;
        }
      }
      if(flag){
        break;
      }
      n++;
    }
    System.out.println(n);
  }
}