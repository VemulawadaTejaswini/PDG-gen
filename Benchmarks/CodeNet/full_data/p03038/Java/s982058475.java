import java.util.*;

class Step implements Comparable<Step>{
  int b;
  long c;
  public Step( int d, long e ){
    b = d;
    c = e;
  }

  @Override
  public int compareTo( Step p ){
    if(this.c - p.c > 0) return 1;
    else if(this.c - p.c < 0) return -1;
    else return 0;
    //return (int)(this.c - p.c);
  }
}

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int m = sc.nextInt();
        //配列の宣言
        //int[] num = new int[n];
        long[] num = new long[n];

        for(int i = 0; i < n; i++){
            //num[i] = sc.nextInt();
            num[i] = sc.nextLong();
        }

        Arrays.sort(num);

        List<Step> list = new ArrayList<>();

        int b;
        long c;
        for(int i = 0; i < m; i++){
            b = sc.nextInt();
            c = sc.nextLong();
            if(num[0] < c) list.add(new Step(b, c));
        }
        Collections.sort(list, Comparator.reverseOrder());
        //System.out.println(list);
        for(int i = 0; i < m; i++){
            b = list.get(i).b;
            c = list.get(i).c;
            if(num[0] >= c) break;
            for(int j = 0; j < b; j++){
                if(num[j] < c){
                    num[j] = c;
                }else{
                    break;
                }
            }
            Arrays.sort(num);
        }

        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += num[i];
        }

        // 出力
        System.out.println(ans);

    }

}
