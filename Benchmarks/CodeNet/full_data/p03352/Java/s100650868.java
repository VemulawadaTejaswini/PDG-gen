import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int res = 1;
    for(int i=2; i<x; i++){
      res = Math.max(res, getMax(x,i));
    }
    System.out.println(res);
  }

  public static int getMax(int x, int w){
    int r = w*w;
    if(r>x) return -1;
    while(r*w<=x){
      r *= w;
    }
    return r;
  }
}