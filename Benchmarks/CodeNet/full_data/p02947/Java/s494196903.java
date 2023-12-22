import java.util.*;
//実行時間超過＆1/13不正解
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		//文字列入力
		String[] inputList = new String[N];
		for(int i = 0; i < N; i++){
			//
			String input = sc.next();
			//
			String[] stringArray = input.split("");
			//
			Arrays.sort(stringArray);
			//
			String sortedInput = String.join("", stringArray);
			//
			inputList[i] = sortedInput;
		}
		//最終結果用
		int counter = 0;
		for(int i = 0; i < N-1; i++){
			for(int j = i+1; j < N; j++){
				if(inputList[i].equals(inputList[j])){
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}