import java.util.Scanner;
	public class Main{
      public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //文字を指定する（0番目）
        char c = sc.next().charAt(1);
		//指定した文字に文字コード+1をして文字として表示させる
        System.out.println((char)(c+1));
      }
    }