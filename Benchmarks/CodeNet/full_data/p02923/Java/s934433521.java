import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int num = sc.nextInt();
		
        int[] array = new int[num];
        for(int i = 0; i < num;i++){
          array[i] = sc.nextInt();
        }
 
        int max = 0;
        for(int i = 0; i < array.length; i++){
          int count = 0;
          for(int j = i; j < array.length - i - 1; j++){
            if(array[j] < array[j+1]){
              count++;
            }
          }
          max = max < count ? count : max;
        }
      
		// 出力
		System.out.println(max);
	}
}