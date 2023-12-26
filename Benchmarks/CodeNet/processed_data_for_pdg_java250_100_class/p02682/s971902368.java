public class Main {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int A = cin.nextInt();
    int B = cin.nextInt();
    int C = cin.nextInt();
    int K = cin.nextInt();
    int ans = 0;
    for (int i=0;i<A;i++){
      K = K - 1;
      if (K < 0) break;
      ans = ans + 1;
    }
    for (int i=0;i<B;i++){
      K = K - 1;
      if (K < 0) break;
      ans = ans + 0;
    }
    for (int i=0;i<C;i++){
      K = K - 1;
      if (K < 0) break;
      ans = ans - 1;
    }
    System.out.println(ans);
  }
}
