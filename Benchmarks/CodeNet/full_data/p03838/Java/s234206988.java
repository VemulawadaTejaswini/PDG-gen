import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long count = 0;
    if(x==0){
      if(y>=0){
        System.out.println(Math.abs(y));
        return;
      }else{
        System.out.println(Math.abs(y)+1);
        return;
      }
    }
    if(y==0){
      if(x<=0){
        System.out.println(Math.abs(x));
        return;
      }else{
        System.out.println(Math.abs(x)+1);
        return;
      }
    }
    if(x*y>0){
      if(y-x>0){
        System.out.println(y-x);
      }else{
        System.out.println(x-y+2);
      }
    }else{
      if(x<0){//x ga hu
        if(Math.abs(x)<=Math.abs(y)){
          System.out.println(Math.abs(y)-Math.abs(x)+1);
        }else{
          System.out.println(Math.abs(x)-Math.abs(y)+1);
        }
      }else{//y ga hu
        if (Math.abs(x)>=Math.abs(y)) {
          System.out.println(Math.abs(x)-Math.abs(y)+1);
        }else{
          System.out.println(Math.abs(y)-Math.abs(x)+1);
        }
      }
    }

  }
}
