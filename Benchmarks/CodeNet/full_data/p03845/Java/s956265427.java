import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      t[i]=sc.nextInt();
      sum+=t[i];
    }
    int m=sc.nextInt();
    int p[]=new int[n];
    int x[]=new int[n];
    int newSum[]=new int[m];
    for(int i=0;i<m;i++){
      p[i]=sc.nextInt();
      x[i]=sc.nextInt();
      newSum[i]=sum-t[p[i]-1]+x[i];
    }
    sc.close();
    for(int i=0;i<m;i++){
      System.out.println(newSum[i]);
    }
  }
}