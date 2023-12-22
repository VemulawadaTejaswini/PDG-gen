import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      List<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      Integer ndate = Integer.parseInt(sc.next());
      Integer msyuku = Integer.parseInt(sc.next());
      
      //宿題の日数の記録
      List<Integer> num = new ArrayList<>();
      for (int i=0; i<msyuku; i++) {
          int di = sc.nextInt();
          num.add(di);
      }

      int asobu = 0;
      //日数を減らす
      for (int n : num){
          ndate -= n;
      }

      //宿題を終わらせられなければ-1
      if(ndate < 0){
          ndate = -1;
      }

      System.out.println(ndate);
    }
    
}
