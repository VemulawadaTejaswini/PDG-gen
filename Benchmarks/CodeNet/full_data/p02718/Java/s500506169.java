import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int cnt=0;
    int h=N-M;
    int n=0;
    int a[] = new int[N];
    for(int i=0;i<N;i++){
      a[i]=scan.nextInt();
      cnt+=a[i];
    }
    cnt/=M*4;
    for(int i=0;i<N;i++){
      if(a[i]>cnt){
        n++;
      }
    }
    if(n<=h){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}