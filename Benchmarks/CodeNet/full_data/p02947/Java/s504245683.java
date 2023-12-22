import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		//文字列入力
		String[] inputList = new String[N];
		for(int i = 0; i < N; i++){
			inputList[i] = sc.next();
		}
		//最終結果用
		int counter = 0;
		//文字比較
		for(int i = 0; i < N; i++){
			String[] stringArray = inputList[i].split("");
			for(int j = i + 1; j < N; j++){
				String[] stringArray2 = inputList[j].split("");
				int match = 0;
				for(int k = 0; k < stringArray2.length; k++){
					if(Arrays.asList(stringArray).contains(stringArray2[k])){
						match++;
					}
				}
				if(match == 10){
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}