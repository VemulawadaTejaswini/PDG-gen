import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(y>=x){
      System.out.println(y-x);
      return;
    }else if(x>=0&&y>=0){
      System.out.println(1+y+x);
      return;
    }else if(x<0&&y<0){
      System.out.println(2+x-y);
      return;
    }else if(x==0&&y<0){
      System.out.println(1-y);
      return;
    }else if(-y>x){
      System.out.println(1+y-x);
      return;
    }else if(x==-y){
      System.out.println(1);
    }else{
      System.out.println(1+x+y);
    }
  }
}