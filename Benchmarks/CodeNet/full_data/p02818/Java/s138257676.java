    import java.util.Scanner;;
    public class Main{
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int A = Integer.parseInt(sc.next());
          if(A>=1000000000000){
            A=0;
          }
            int B = Integer.parseInt(sc.next());
          if(B>=1000000000000){
            B=0;
          }
            int K = Integer.parseInt(sc.next());
          if(K>=1000000000000){
            K=0;
          }
            for (int i=0; i < K; i++) {
                if (A >= 1) {
                    A = A - 1;
                } else if (A == 0) {
                    if (B >= 1) {
                        B = B - 1;
                    }
                }
            }
            System.out.println(A + " " + B);
        }
    }