
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] inputArray = getInput();
		int[] inputArrayInt = StringList_change_intList(inputArray);
		int max_number = max_input_number(inputArrayInt);
		int answer = answer_get(max_number,inputArrayInt);
		System.out.println(answer);

	}

	//標準入力を受け取る
	private static String[] getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String count = br.readLine();// 入力される値の数
		String s = br.readLine();// 空白区切りで入力される値の文字列
		String[] array = s.split(" ");
		System.out.println(array[1]);
		return array;
	}

	//String型配列をint型配列にして返す
	private static int[] StringList_change_intList(String array[]){
		int[] arrayInt = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayInt[i] = Integer.parseInt(array[i]);
		}
		return arrayInt;
	}

	//入力値の最大値を取得
	private static int max_input_number(int[] array){
		int max_number = 0;
		for(int i = 0;i < array.length;i++){
			max_number = Math.max(max_number,array[i]);
		}
		return max_number;
	}

	private static int answer_get(int max_number,int[] inputArrayInt){
		int sum = 0;
		for(int i = 0;i < max_number;i++){
			int count = 0;
			for(int j = 0;j < inputArrayInt.length;i++){
				int x = inputArrayInt[j];
				if(i + 1 == x || i == x || i - 1 == x){
					count++;
				}
			}
			sum = Math.max(sum, count);
		}
		return sum;
	}
}
