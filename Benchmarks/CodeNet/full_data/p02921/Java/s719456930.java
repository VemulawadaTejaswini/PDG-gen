import  java.util.Scanner;
//import jaava.util.InputMismatchException;
public class Main{
  public static void main(String[] args){
    String yohou[] = new String[3];
    String kekka[] = new String[3];
    int i = 0;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    for(i=0;i<yohou.length;i++){
      //System.out.println("文字列を入力");

      yohou[i] = sc.next();
      //天気予報のデータを保存
    }
    //System.out.println("予報のデータを入力");
    for(i=0;i<kekka.length;i++){
      //System.out.println("文字列を入力");
      kekka[i] = sc.next();
      //結果のデータを保存
    }
    //System.out.println("結果のデータを入力");
    for(i=0;i<3;i++){
      //System.out.println(yohou[i]);
      //System.out.println(kekka[i]);
      if(yohou[i].equals(kekka[i])){count++;}
    }
    System.out.println(count);
  }
}
