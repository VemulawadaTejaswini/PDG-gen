import java.util.Scanner;

class Main {
  public static void main(String args[]){
    int A;
    int B;
//ここから標準入力のやつ
    Scanner sc = new Scanner(System.in);

    A = sc.nextInt();
    B = sc.nextInt();
//ここまで標準入力のやつ
    if(A > 8 || B >8){
      System.out.println(":("); //AかBのどっちかが8より大きいとダメ
    }else{
      System.out.println("Yay!"); //そうでなければ大丈夫
    }
  }
}
