import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int ans;
    int cnt = 0;
    int num = 0;

    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int absc = Math.abs(c);

    ArrayList<int> B = new ArrayList<int>();

    ArrayList<int> A = new ArrayList<int>();

    ArrayList<A>  M  = new ArrayList< A >();

    for (int i = 0;i < m ;i++){
      B.add(sc.nextInt());
    }

      for (int j = 0;j < n ;j++){
        for (int i = 0;i < m ;i++){
          A.add(sc.nextInt());
        }
        M.add(A);
      }

      for ( i = 0;i < n; i++){
        for (j = 0;j < m; j++){
          num += B.get(j)* M.get(i).get(j);

          if ( num > c){
            cnt++
          }

        }
      }
      ans = cnt

      System.out.println(ans);
    }

  }
