import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=Math.abs(sc.nextInt())-1;
    int s=0;
    int p=0;
    if(x==-1){
      System.out.println(0);
    }else{
      while(true){
        if(p<=x&&x<p+s){
          break;
        }
        p+=s;
        s++;
      }
      System.out.println(s);
    }
  }
}