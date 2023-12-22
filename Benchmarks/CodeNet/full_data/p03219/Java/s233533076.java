import java.util.Scanner;
//なんかよくわからないやつ
public class Abc113a{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      //入力のやつ
        int x = scan.nextInt();
        //鉄道運賃
        int y = scan.nextInt();
        //バス運賃
        System.out.println(x + y / 2);
        //合計運賃を計算して出力
    }
}