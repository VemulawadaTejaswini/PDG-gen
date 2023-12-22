import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        Collections.sort(list);
        int ans = list.get(0) + list.get(1);
    
		// 出力
		System.out.println(ans);
	}
}
