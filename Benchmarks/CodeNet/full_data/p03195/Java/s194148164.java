import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] a=new int[N];
    for(int i=0;i<N;i++){
      a[i]=scan.nextInt();
    }
    for(int i=0;i<N;i++){
      if(a[i]%2!=0){
        System.out.println("first");
        System.exit(0);
      }
    }
      System.out.println("second");
  }
}