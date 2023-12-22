import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    double w,h,x,y,max,minx,miny,ans;
    Scanner sc=new Scanner(System.in);
    w=sc.nextInt();
    h=sc.nextInt();
    x=sc.nextInt();
    y=sc.nextInt();
    max=w*h;
    minx=(max-x*h < x*h)?max-x*h:x*h;
    miny=(max-w*y < w*y)?max-w*y:w*y;
    if(minx==miny){
      ans=minx;
      System.out.format("%lf %d",ans, 1);
    }
    else{
      ans=Math.max(minx,miny);
      System.out.format("%lf %d",ans, 0);
    }
  }
}
