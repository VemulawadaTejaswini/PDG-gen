import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    double M=sc.nextDouble();
    double As[]=new double[N];
    double sum=0;
    for(int i=0;i<N;i++){
      As[i]=sc.nextDouble();
      sum+=As[i];
    }

    boolean judge=false;
    for (int i = 0; i < As.length - 1; i++) {
        for (int j = As.length - 1; j > i; j--) {
            if (As[j - 1] < As[j]) {
                // 入れ替え
                double tmp = As[j - 1];
                As[j - 1] = As[j];
                As[j] = tmp;
            }
         }
    }
    int Msub=(int)M;
    double abc=sum/(4*M);
        if (As[Msub-1]>=abc) {
          judge=true;
        }


      if (judge) {
        System.out.println("Yes");
      }else{
       System.out.println("No");
      }
        }
      }
