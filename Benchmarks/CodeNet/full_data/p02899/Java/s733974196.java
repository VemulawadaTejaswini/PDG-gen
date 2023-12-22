import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int temp;
    int aa[]=new int[n];
    for(int i=0;i<n;i++){
      aa[i]=i+1;
    }
    for(int i=0;i<n-1;i++){
      for(int k=n-1;k>i;k--){
        if(a[k-1]>a[k]){
          temp=a[k];
          a[k]=a[k-1];
          a[k-1]=temp;
          temp=aa[k];
          aa[k]=aa[k-1];
          aa[k-1]=temp;
        }
      }
    }

    for(int i=0;i<n;i++){
      System.out.print(aa[i]+" ");
    }
    System.out.println("");

    
  }
}