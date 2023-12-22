import java.util.Scanner;

public class Main{
  public static void main(String [] args){

    //nextLine():1行分の入力を取得する
    //length():文字列の長さを取得する
    //substring(a,b):aからb-1までのインデントに対応する文字を切り取る

    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    int[] save = new int[s.length()];
    int min = 1000;

    for(int i = 0; i < s.length()-2; i++){
      save[i] =  Integer.parseInt( s.substring(i,i+3) );
      System.out.println(save[i]);
    }

    for(int i = 0; i < s.length()-2; i++){

      save[i] = 753 - save[i];
      if(save[i] < 0){
        save[i] = -save[i];
      }
      if(save[i] < min){
        min = save[i];
      }
    }
    System.out.println(min);
  }
}