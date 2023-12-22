import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    long sum=0;
    int i;
    for(i=0;i<n;i++){
      sum+=a[i];
      if(sum>x){
        break;
      }
    }
    if(i==n&&sum!=x){
      System.out.println(i-1);
    }else{
      System.out.println(i);
    }
  }
}