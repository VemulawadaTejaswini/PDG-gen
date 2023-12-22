import java.util.*;

class Shop implements Comparable<Shop>{
  String s;
  int p, n;
  public Shop( String str, int i , int j){
    s = str;
    p = i;
    n = j;
  }

  @Override
  public int compareTo( Shop t ){
    if(this.s.compareTo(t.s) > 0) return - 1;
    else if(this.s.compareTo(t.s) < 0) return 1;
    else return (int)(this.p - t.p);
  }
}

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        List<Shop> list = new ArrayList<>();

        String a;
        int b, c;
        for(int i = 0; i < n; i++){
            a = sc.next();
            b = sc.nextInt();
            c = i;
            list.add(new Shop(a, b, c));
        }

        Collections.sort(list, Comparator.reverseOrder());

        // 出力
        for(int i = 0; i < n; i++){
            System.out.println(list.get(i).n + 1);
        }

    }

}
