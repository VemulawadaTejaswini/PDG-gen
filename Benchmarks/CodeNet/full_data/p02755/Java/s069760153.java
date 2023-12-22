import java.util.Scanner;
public class Main{
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    double d = a/0.08;
    int x = (int)(a/0.08);//a=x*0.08
    if(d!=x) x++;
      //消費税がa円である範囲(とりあえずxは範囲内)
    int min = a;
    int max = a;
    int xmin = x;
    int xmax = x;
    int i = 0;
    while(min==a){
      min = (int)(xmin*0.08);
      xmin--;
    }
    while(max==a){
      max = (int)(xmax*0.08);
      xmax++;
    }
    //xmin<x<xmaxの間の数のうち最小のものが答
   	for(int j = xmin+2; j<xmax-1; j++){
      if(b==j*0.1){
        System.out.println(j);
        return;
      }
    }
    System.out.println(-1);
  }
}