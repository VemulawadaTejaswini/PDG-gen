import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i < 3; i++) {
          list.add(sc.nextInt());
        }
        Collections.sort(list);
    
		// 出力
		System.out.println(list.get(0) + list.get(1));
	}
}