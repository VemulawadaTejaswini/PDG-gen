import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A[] = new int[N];
    for(int i=0;i<N;i++){
      A[i] = Integer.parseInt(sc.next());
    }
    boolean f = true;
    int cnt = 1;
    for(int i=1;i<N;i++){
      f = true;
      for(int j= i-1;j>=0;j--){
        if(A[j]>=A[i]){
        }else{
          f = false;
        }
      }
      if(f==true){
        cnt++;
      }
    }
    System.out.println(cnt);

  }
}

