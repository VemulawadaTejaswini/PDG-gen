import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    if(N == 0){
      System.out.print(K);
    }else if(N==1){
      System.out.print(K*100);
    }else{
      System.out.print(K*10000);
    }
  }
}
