import java.utill.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int[] s=new int[n];
    int sum=0;
    int res=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      sum+=a[i];
      s[i]=sum;
    }
    for(int i=0;i<n;i++){
      res=Math.min(res,Math.abs(s[i]-(sum-s[i])));
    }
    System.out.println(res);
  }
}