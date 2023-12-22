import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int N;
      String S;
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt(); //入力文字数
      S = sc.next(); //入力文字列
      
//      System.out.println(N);
//      System.out.println(S);
      
      String[] stringArray;   //String型の配列stringArrayを宣言
      stringArray = new String[N];  //N個のstring型データを持つ配列stringArrayを生成
      
//        System.out.println("===========================================");

      //(1)初期値i=0、iがN以下の間forループ内を実行 配列に数値を入れる
      for(int i = 0; i < N; i++) {
        stringArray[i] =  S.substring(i,i+1); //i番目からi+1番目の前まで(つまりi番目を入れること)
//        System.out.println("|"+stringArray[i]+"|");
      }
//        System.out.println("===========================================");
      
      int counter=0; //切れ目の数
      String x; //ひとつ前の文字
      x=" ";
      
      //(1)初期値i=0、iがN以下の間forループ内を実行
      for(int i = 0; i < N; i++) {
//          System.out.println("iは" + i + "です。");
        if( stringArray[i].equals(x) ) {
//          System.out.println("ひとしい");
        } else {
          counter = counter+1 ;
          x = stringArray[i];
//          System.out.println("xは" + x + "です。");
//          System.out.println(counter);
//          System.out.println(stringArray[i]);
        }
      }

      System.out.println(counter);

    }
}//mainの終わり

