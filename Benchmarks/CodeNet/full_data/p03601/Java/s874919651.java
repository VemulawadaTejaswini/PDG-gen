import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    int maxA = 0;
    int maxB = 0;
    double max = 0;
    for(int i=0;i<=30;i++)
      for(int j=0;j<=30;j++)
        for(int k=0;k<=1000;k++)
          for(int l=0;l<=1000;l++){
            if(i+j==0||k+l==0)continue;
            int s = 100*a*i+100*b*j;
            int t = c*k+d*l;
            if((a*i+b*j)*e>=c*k+d*l&&s+t<=f){
              double per = (double)(100*t)/(s+t);
              if(per>max){
                max = per;
                maxA = s+t;
                maxB = t;
              }
            }
          }
    System.out.println(maxA+" "+maxB);
  }
}