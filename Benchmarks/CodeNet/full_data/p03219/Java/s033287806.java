import java.util.Scanner;
//なんかよくわからないやつ
class Abc113a{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      //入力のやつ
        int x = sc.nextInt();
        //鉄道運賃
        int y = sc.nextInt();
        //バス運賃
        System.out.println(x + y / 2);
        //合計運賃を計算して出力
    }
}