import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(y>=x){
      System.out.println(y-x);
      return;
    }
    int cnt1 = 1;
    int cnt2 = 1;
    int cnt3 = 2;
    int x1 = x;
    int x2 = -x;
    int x3 = -x;
    if(y>=0){
      cnt1+=1000000000;
      cnt2+=y+x;
      cnt3+=1000000000;
    }
    else if(-y<x){
      cnt1+=1000000000;
      cnt2+=y+x;
      cnt3+=x-y;
    }
    else{
      cnt1+=-y-x;
      cnt2+=1000000000;
      cnt3+=x-y;
    }
    System.out.println(Math.min(cnt1,Math.min(cnt2,cnt3)));
  }
}
