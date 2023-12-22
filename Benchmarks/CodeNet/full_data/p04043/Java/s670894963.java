import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
      int Count5=0;
      int Count7=0;

             //配列の宣言
       int array[] = new int[5];
      for(int i=0;i<3;i++){
        array[i]=sc.nextInt();
        if (array[i]==5){
          Count5++;
        }else if (array[i]==7){
          Count7++;
        }
      }

		// 出力
      if (Count5==2&&Count7==1){
		System.out.println("YES");
      }else{
		System.out.println("NO");
      }
   }
}