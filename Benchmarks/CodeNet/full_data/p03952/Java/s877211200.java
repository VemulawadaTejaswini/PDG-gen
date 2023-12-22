import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    if(x==1||x==2*n-1){
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
    int[] cen = {x-2,x+1,x,x-1};
    int min = x-2;
    if(x==2){
      cen[0]=x+2;
      cen[1]=x-1;
      cen[3]=x+1;
      min=x-1;
    }
    if(n==2){
      System.out.println("1");
      System.out.println("2");
      System.out.println("3");
      return;
    }
    int num = 0;
    for(int i=0;i<n-3;i++){
      num++;
      if(num==min)num+=4;
      System.out.println(num);
    }
    for(int i=0;i<4;i++)System.out.println(cen[i]);
    for(int i=0;i<n-2;i++){
      num++;
      if(num==min)num+=4;
      System.out.println(num);
    }
  }
}