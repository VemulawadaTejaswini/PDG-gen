import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int r=0;
    for(int i=0;i<n;++i){
      a[i]=sc.nextInt();
      while(a[i]%2==0){
        r++;
        a[i]/=2;
      }
    }
    System.out.println(r);
    
  }
}