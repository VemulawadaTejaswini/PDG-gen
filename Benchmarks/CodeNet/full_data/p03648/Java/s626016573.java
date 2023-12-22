import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    System.out.println(50);
    long[] a = new long[50];
    for(int i=0;i<50;i++)a[i]=i+k/50;
    int m = (int)k%50;
    for(int i=0;i<m;i++){
      a[i]+=51;
      for(int j=0;j<50;j++)a[j]--;
    }
    System.out.print(a[0]);
    for(int i=1;i<50;i++)System.out.print(" "+a[i]);
    System.out.println("");
  }
}