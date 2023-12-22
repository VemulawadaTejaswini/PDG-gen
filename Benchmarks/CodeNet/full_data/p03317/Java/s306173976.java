import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int k = sc.nextInt();
		// 文字列の入力
		List<Integer> list = new ArrayList<>();
		int resultCount =0;

		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
      Optional<Integer> min = list.stream()
                            .min((a, b) -> a.compareTo(b));
        int count = 0;
		for(int j=0;j<n;j++){
			if(min.get()==list.get(j)){
				count++;
			}
		}
		resultCount = ((n-count+1)/(k-1)) ;

      System.out.println(resultCount);
	}
}