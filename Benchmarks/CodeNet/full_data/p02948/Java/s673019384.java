import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N]; 
    int[] B = new int[N];

    Data []d = new Data[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
      d[i] = new Data(A[i], B[i]);
    }

    sc.close(); 

    Arrays.sort(d, new Comparator<Data>() {
      public int compare(Data d1, Data d2) {
          int t_ = d2.getA() - d1.getA();
          if (t_ == 0) {
            return d2.getB() - d1.getB();
          } else {
            return d2.getA() - d1.getA();
          }
      }
    });

    int day = 0;
    int sum  = 0;

    for(int i = 0; i < N; i++) {
        if (d[i].getA() <= M) {
          if (day != d[i].getA() || d[i].getA() == 1){
            day = d[i].getA();
            sum += d[i].getB();
            M--;
            if (M <= 0) {
              break;
            }
          }
        }
    }

    System.out.println(sum);
  
  }

  public static class Data{
    private int a;
    private int b;
    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
  }

}