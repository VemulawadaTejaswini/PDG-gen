import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値を取得
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		// 回文数列を作成
		List<Integer> kaibun = new ArrayList<Integer>();
		for(int i = 1; i <= 9 ; i++){
			String value = String.valueOf(i);
			String tmpStr = value + "000" + value;
			Integer tmpInt = Integer.parseInt(tmpStr);
			kaibun.add(tmpInt);
			for(int j = 1; j <= 9 ; j++){
				String value2 = String.valueOf(j);
				String tmpStr2 = value + "0" +value2 + "0" + value;
				String tmpStr3 = value + value2 + "0" + value2 + value;
				Integer tmpInt2 = Integer.parseInt(tmpStr2);
				Integer tmpInt3 = Integer.parseInt(tmpStr3);
				kaibun.add(tmpInt2);
				kaibun.add(tmpInt3);
				for(int k = 1; k <= 9 ; k++){
					String value3 = String.valueOf(k);
					String tmpStr4 = value + value2 + value3 + value2 + value;
					Integer tmpInt4 = Integer.parseInt(tmpStr4);
					kaibun.add(tmpInt4);
				}
			}
		}
		Collections.sort(kaibun);
		kaibun = kaibun.stream().distinct().collect(Collectors.toList());
		int startIndex = 0;
		int endIndex = 0;
		for(int i = 0; i < kaibun.size(); i++){
			if(a <= kaibun.get(i)){
				startIndex = i;
				break;
			}
		}
		for(int j = startIndex; j < kaibun.size(); j++){
			if(b < kaibun.get(j)){
				endIndex = j -1;
				break;
			}else if(b.equals(kaibun.get(j))){
				endIndex = j;
				break;
			}
		}
		int count = endIndex - startIndex + 1;
		System.out.println(count);
	}
}