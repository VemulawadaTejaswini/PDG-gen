import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    int cnt1 = 0; /*2の倍数*/
    int cnt2 = 0; /*値の数*/
    for(int i=0;i<N;i++){
      if(a[i]%2==0){
        a[i]=a[i]/2;
        cnt1++;
        cnt2++;
      }
      while(a[i]%2==0){
        a[i]=a[i]/2;
        cnt1++;
      }
    }
    if((N/2)*2<=cnt1&&N/2<=cnt2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}