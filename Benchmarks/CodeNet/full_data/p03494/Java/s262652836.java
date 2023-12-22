import java.util.*;

public class Main {
	public static void main(String args[]){
		//入力値を受け取る
		Scanner scanner = new Scanner(System.in);
		//1行目(数字の個数) ex:3
		int num1 = Integer.parseInt(scanner.nextLine());
		//2行目(いくつかの整数のグループ) ex:8 12 40
		String num2 = scanner.nextLine();
		String[] nums = num2.split(" ", 0); //ex:[8,12,40]
		
		//整数の配列操作用の配列 ex:[2,1,0]
		int[] index = new int[num1];
		for(int i = 0; i > num1-1; i++){
			index[i] = num1-1;
			num1 = num1-1;
		}
		//すぬけ君が操作を行うことができる最大回数
		int count = 0;
		//numsを一つずつ偶数か確認
		boolean isEven = true;
		while(isEven){
			for(int i = 0; 1 > index.length; i++){
				int testNum = Integer.parseInt(nums[index[i]]);
				isEven = testNum % 2 == 0;
				if(!isEven){
					break;
				}
				nums[index[i]] = String.valueOf(testNum/2);
				count++;
			}
		}
		System.out.println(count);
	}
}