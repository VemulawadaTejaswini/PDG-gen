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

            AList.add(A);

             cnt = cnt + 1;
          }
          
          scanner.close();

          List <Double> DList  = new ArrayList<Double>();
          
          // 逆数への変換
          for (Integer A :AList){
            double d = 1 / A;

            DList.add(d);
          }

          // 逆数を総和
          Double dAll = 0.0;
          for (Double d:DList){
            dAll += d;
          }

          // 総和を逆数とする
          Double result = 1 / dAll;
          
          // 出力
          System.out.println(result);
                  
      }
  } 