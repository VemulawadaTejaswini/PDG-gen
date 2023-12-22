  import java.util.*;

  public class Main {
      public static void main (String[]args){

          Scanner scanner = new Scanner(System.in);
          
          int N = scanner.nextInt();

          int cnt = 0;

          List <Integer> AList  = new ArrayList<Integer>();

          // 入力数に従って標準入力
          while (cnt < N){

            Integer A = scanner.nextInt();

            Alist.add(A);

            cnt++;
          }
          scanner.close();

          List <double> DList  = new ArrayList<double>();
          
          // 逆数への変換
          for (Integer A :Alist){
            double d = 1 / A;

            DList.add(d);
          }

          // 逆数を総和
          double dAll;
          for (double d:DList){
            dAll += d;
          }

          // 総和を逆数とする
          double result = 1 / dAll;
          
          // 出力
          System.out.println(result);
                  
      }
  } 