import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int[] wb=new int[n+1];
    int[] ww=new int[n+1];
    for(int i=0;i<n;i++){
      wb[i+1]=wb[i];
      ww[i+1]=ww[i];
      (s.charAt(i)=='#'?wb:ww)[i+1]++;
    }
    int min=n;
    for(int i=0;i<=n;i++){
      min=Math.min(wb[i]-wb[0]+ww[n]-ww[i],min);
      //System.err.println((wb[i]-wb[0])+" : "+(ww[n]-ww[i]));
    }
    System.out.println(min);
  }
}