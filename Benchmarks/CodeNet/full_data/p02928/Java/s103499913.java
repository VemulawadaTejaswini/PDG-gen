import java.util.*;
  public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    int cntBefore=0;
    int cntAfter=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    sc.close();
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){//前をカウント
        if(a[i]>a[j]){
          cntBefore++;
        }
      }
      for(int j=i+1;j<n;j++){//後ろをカウント
        if(a[i]>a[j]){
        cntAfter++;
        }
      }
    }
    long cntSum=-(cntBefore*k);
    long cntAB=cntAfter+cntBefore;
    for(long i=1;i<=k;i++){
      cntSum=(cntSum+(cntAB*i));
      if(cntSum>100000007){
        cntSum%=1000000007;
      }
    }
    System.out.println(cntSum);
  }
}