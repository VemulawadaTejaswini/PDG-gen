import java.util.*;
public class Main {
  static int num=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B=sc.nextInt();
      int C =sc.nextInt();
      int D=sc.nextInt();
      for(int i=A+1;i<B;i++){
      if(i%C==0||i%D==0){
        num++;
      }
      }
      System.out.println(num);
     	}
}