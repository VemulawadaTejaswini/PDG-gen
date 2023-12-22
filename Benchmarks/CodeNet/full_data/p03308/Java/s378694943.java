import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int min=1000000000,max=1;
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      if(a[i]<min) min=a[i];
      else if(a[i]>max) max=a[i];
    }
    System.out.println(max-min);
  }
}