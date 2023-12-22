import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		String s = sc.next();

		int max = 0;

		String[] sArray = s.split("");
		List<String> array = new LinkedList(Arrays.asList(sArray));
		array.remove(0);

		//s.substring(i);
		//s.contains(array.get(0)

		//i … 区切り／j … リスト番号1／k … リスト番号2
		for (int i = 1; i < n-1; i++){
			int tempMax = 0;
			for (int j = 0; j < i; j++){
				for (int k = j+1; k < n-1; k++){
					if (array.get(j).equals(array.get(k))){
						tempMax++;
					}
				}
			}
			max = Math.max(max, tempMax);
		}

		// 出力
		System.out.println(max);
	}
}