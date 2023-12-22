java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //偶数の個数
    int M = sc.nextInt(); //奇数の個数
    //偶数になるのは奇数+奇数もしくは偶数+偶数
    //奇数+奇数の場合N_C_2
    int count_1 = N*(N-1)/2;
    //偶数+偶数の場合M_C_2
    int count_2 = M*(M-1)/2;
    
    System.out.println( count_1 + count_2);
    
    
  }
}