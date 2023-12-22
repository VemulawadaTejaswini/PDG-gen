import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int xRatio[]=new int[n];
    int yRatio[]=new int[n];
    int x[]=new int[n];
    int y[]=new int[n];
    for(int i=0;i<n;i++){
      xRatio[i]=sc.nextInt();
      yRatio[i]=sc.nextInt();
    }
    sc.close();
    x[0]=xRatio[0];
    y[0]=yRatio[0];
    for(int i=1;i<n;i++){
      double ratio1=Math.ceil((double)x[i-1]/xRatio[i]);
      double ratio2=Math.ceil((double)y[i-1]/yRatio[i]);
      double ratio=Math.max(ratio1,ratio2);
      x[i]=(int)xRatio[i]*(int)ratio;
      y[i]=(int)yRatio[i]*(int)ratio;
    }
    System.out.println(x[i]+y[i]);
  }
}