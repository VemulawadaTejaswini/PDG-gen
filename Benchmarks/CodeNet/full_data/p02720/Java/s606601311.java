import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int count = 0;
    int i = 0;
    int a=0,b=0,c=0,d=0,e=0,f=0;
    while(count < k){
      i++;
      a=i/100000*100000;
      b=(i-a)/10000*10000;
      c=(i-a-b)/1000*1000;
      d=(i-a-b-c)/100*100;
      e=(i-a-b-c-d)/10*10;
      f=i-a-b-c-d-e;

      a/=100000;
      b/=10000;
      c/=1000;
      d/=100;
      e/=10;
      if(a==0&&b!=0){
        a=b;
      }
      if(a==0&&b==0&&c!=0){
        a=c;
        b=c;
      }
      if(a==0&&b==0&&c==0&&d!=0){
        a=d;
        b=d;
        c=d;
      }
      if(a==0&&b==0&&c==0&&d==0&&e!=0){
        a=e;
        b=e;
        c=e;
        d=e;
      }
      if(a==0&&b==0&&c==0&&d==0&&e==0&&f!=0){
        a=f;
        b=f;
        c=f;
        d=f;
        e=f;
      }

      if(Math.abs(a-b)<2 && Math.abs(b-c)<2 && Math.abs(c-d)<2 && Math.abs(d-e)<2 && Math.abs(e-f)<2){
        count++;
      }
      if(count == k){
        System.out.println(i);
      }
    }

  }
}
