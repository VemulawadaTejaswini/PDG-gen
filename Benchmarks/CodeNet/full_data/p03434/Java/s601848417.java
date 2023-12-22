import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
		// Alice,Bob got poit.
		int a = 0;
        int b = 0;
        for (int i = 0; i <= n; i+=2) {
            a += list.get(i);
            if (i < n) {
                b += list.get(i+1);
            }
        }
		// 出力
		System.out.println(a-b);
	}
}
