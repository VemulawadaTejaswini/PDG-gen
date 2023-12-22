import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int cnt1 = 1;
    int cnt2 = 1;
    int cnt3 = 2;
    if(x<=y){
      if(x>=0||y<=0){
        System.out.println(y-x);
        return;
      }else if(-x>y){
        System.out.println(y-x);
        return;
      }else if(-x==y){
        System.out.println(1);
        return;
      }else{
        System.out.println(1+y+x);
        return;
      }
    }
    if(y>=0){
      cnt1+=2000000000;
      cnt2+=y+x;
      cnt3+=2000000000;
    }
    else if(-y<x){
      cnt1+=2000000000;
      cnt2+=y+x;
      cnt3+=x-y;
    }
    else{
      cnt1+=-y-x;
      cnt2+=2000000000;
      cnt3+=x-y;
    }
    System.out.println(Math.min(cnt1,Math.min(cnt2,cnt3)));
  }
}
