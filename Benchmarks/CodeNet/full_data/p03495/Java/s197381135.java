import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[200001];
    for(int i=0;i<n;i++){
      a[sc.nextInt()]++;
    }
    Arrays.sort(a);
    long sum=0;
    for(int i=0;i<200001-k;i++){
      sum+=a[i];
    }
    System.out.println(sum);
  }
}