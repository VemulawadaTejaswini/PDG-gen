import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int K = cin.nextInt();
		int value[] = new int [N];
		int sum = 0;
		int result=0;
		Map<Integer,Integer> mapv = new HashMap<>();
		for(int i=0;i<N;i++){
			int tmp1 = cin.nextInt();
			int tmp2 = cin.nextInt();
			value[i] = tmp1;
			if(mapv.containsKey(tmp1)){
				mapv.put(tmp1, mapv.get(tmp1)+tmp2);
			}else{
				mapv.put(tmp1, tmp2);
			}
		}
		cin.close();
		Arrays.sort(value);
		int tmp_v = value[0];
		for(int j=0;j<N;j++){
			if(j>0&&value[j]==tmp_v){
				continue;
			}else{
				sum += mapv.get(value[j]);
				tmp_v = value[j];
				if(K<=sum){
					result = value[j];
					break;
				}
			}
		}
		System.out.println(result);
	}
}
