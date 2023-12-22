import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int As[]=new int[N];
    int sum=0;
    for(int i=0;i<N;i++){
      As[i]=sc.nextInt();
      sum=+As[i];
    }
    boolean judge=true;
    for (int i = 0; i < As.length - 1; i++) {
        for (int j = As.length - 1; j > i; j--) {
            if (As[j - 1] > As[j]) {
                // 入れ替え
                int tmp = As[j - 1];
                As[j - 1] = As[j];
                As[j] = tmp;
            }
         }
    }

      for(int i=0;i<M;i++){
        if (As[i]/sum>=sum/(4*M)) {

          judge=false;
          break;
        }
      }
      if (judge) {
        System.out.println("Yes");
      }else{
       System.out.println("No");
      }
        }
      }
