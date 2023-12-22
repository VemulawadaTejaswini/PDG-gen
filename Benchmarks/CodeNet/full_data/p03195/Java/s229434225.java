import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] a=new int[N];
    for(int i=0;i<N;i++){
      a[i]=scan.nextInt();
    }
    int sum=0;
    for(int i=0;i<N;i++){
      if(a[i]%2==0){
        a[i]--;
        sum+=a[i];
      }else{
        sum+=a[i];
      }
    }
    if(sum%2==0){
      System.out.println("first");
    }else{
      System.out.println("second");
    }
  }
}