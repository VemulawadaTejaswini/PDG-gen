import java.util.*;
class Main{
  public static void main(String args[]){
    long h,w;
    Scanner s = new Scanner(System.in);
    h = s.nextInt();
    w = s.nextInt();
    if(h>1 && w>1){
      long total = ((w+1)/2)*((h+1)/2)+(w/2)*(h/2);
      System.out.println("" + total);
    }else{
      System.out.println("1");
    }
  }
}