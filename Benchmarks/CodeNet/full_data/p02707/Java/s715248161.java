import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int As[]=new int[N-1];
    int Bs[]=new int[N];
    for (int i=0;i<N-1 ;i++ ) {
      As[i]=sc.nextInt();
    }
    for (int i=0;i<N;i++ ) {
      Bs[i]=0;
    }
    for (int i=0;i<N-1 ;i++ ) {
      for(int j=0;j<N;j++){
        if(As[i]-1==j){
          Bs[j]++;
        }
      }
    }

    for (int i=0;i<N;i++) {
      System.out.println(Bs[i]);
    }


  }
}
