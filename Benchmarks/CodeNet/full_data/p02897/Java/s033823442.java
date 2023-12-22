import java.util.Scanner;
 
public class Main {
  public static void main(String args[]) {
 
	//入力値取得
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
    
    int kisuu = 0;
    //入力値の数ループする
    for (int i = 1; i <= num;  i++){
      //奇数の場合はカウントする
      if (i % 2 != 0){
        kisuu++;
      }
    }
    
    //奇数の確率を出力する
    System.out.println((double)kisuu / num);
        
  }
}