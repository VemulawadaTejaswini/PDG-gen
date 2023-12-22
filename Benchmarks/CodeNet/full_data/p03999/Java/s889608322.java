import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] c = s.toCharArray();
    int l = c.length;
    int sum = 0;

    for(int i=0; i<(1<<(l-1));i++){//演算子に対しての全bit探索
      int[] kigou = new int[l-1];//初期化
      //System.out.println("*");
      for(int j=0; j<l-1;j++){//演算bitチェック
        if((i>>j&1)==1){//jビット目が1かどうか
          kigou[j] = 1;//bit配列への代入
        }
      }
      //System.out.println("***"+Integer.toBinaryString(i));

      //計算開始

      int pp = 0;//乗数
      for(int j=l-1; j>-1;j--){
        sum += (c[j]-48)*Math.pow(10,pp);
        //System.out.println(sum);
        if(j>0&&(kigou[j-1]==1)){
          pp = 0;
        }else{
          pp +=1;
        }
      }

    }

    System.out.println(sum);

  }
}