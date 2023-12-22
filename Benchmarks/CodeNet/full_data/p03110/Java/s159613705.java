import java.util.*;

public class Main{
  double get_money;
  String cur;

  Main(double get_money, String cur){
    if(cur.equals("JPY")){
      this.get_money = get_money;
      this.cur = cur;
    }else if(cur.equals("BTC")){
      this.get_money = get_money * 380000;
      this.cur = cur;
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double sum = 0;
    Main[] d = new Main[n];

    for(int i=0; i<n; i++){
      d[i] = new Main(sc.nextDouble(),sc.next());
      sum += d[i].get_money;
    }
    System.out.println(sum);
  }
}