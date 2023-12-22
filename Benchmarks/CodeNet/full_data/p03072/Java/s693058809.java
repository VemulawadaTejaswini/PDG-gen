import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N=scanner.nextInt();
    int H[] = new int[100];
    int ans=1;
    int flg=0;

    for(int i=0;i<N;i++){
      H[i]=scanner.nextInt();
    }
    for(int i=1;i<N;i++){
      flg=0;
      for(int j=0;j<=i-1;j++){
        if(H[j]>H[i]){
          flg=1;
          break;
        }
      }
      if(flg==0) ans++;
    }

    System.out.println(ans);
  }
}
