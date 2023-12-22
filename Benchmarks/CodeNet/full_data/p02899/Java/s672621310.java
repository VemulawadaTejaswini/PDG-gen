import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int a[]=new int[N];
    int t[]=new int[N];
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
      t[a[i]-1]=i;
    }
    for(int i=0;i<N;i++){
      System.out.println(t[i]+1);
    }

  }
}