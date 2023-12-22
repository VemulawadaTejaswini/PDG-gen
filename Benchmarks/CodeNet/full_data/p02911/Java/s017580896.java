import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    int[] ans = new int[N];
    for(int i=0;i<Q;i++){
      ans[Integer.parseInt(sc.next())-1]++;
    }
   
    for(int i=0;i<N;i++){
      if((K-(Q-ans[i]))>0){
        System.out.print("Yes\n");
      }else{
        System.out.print("No\n");
      }
    }
    System.out.flush();
  }
}