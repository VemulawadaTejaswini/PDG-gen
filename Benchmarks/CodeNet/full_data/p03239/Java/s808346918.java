import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//N T
	int[] ntArray = Arrays.stream(sc.nextLine().split(" ")) //" "で区切ってString配列へ
    .mapToInt(Integer::parseInt) //数値にして
	.toArray(); //配列へ
	int N = ntArray[0];
	int T = ntArray[1];

	int[] ctArray;

	int minc = 10000;
	// c t　格納
	for(int i=1;i<=N;i++){
		ctArray = Arrays.stream(sc.nextLine().split(" ")) //" "で区切ってString配列へ
		.mapToInt(Integer::parseInt) //数値にして
		.toArray(); //配列へ

		//コスト最小？ 時間内？
		if(minc > ctArray[0]){
			if(T >= ctArray[1]){
				minc = ctArray[0];
			}
		}
	}

	if(minc == 10000){
		System.out.println("TLE");
	}else{
		System.out.println(minc);
	}
  }
}