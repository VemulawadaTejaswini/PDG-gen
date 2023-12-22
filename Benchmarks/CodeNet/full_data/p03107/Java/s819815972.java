import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 初期化
		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split("");
		ArrayList<String> list = new ArrayList<String>();
		int cnt=0;
		for(int i=0;i<data.length;i++) {
			list.add(data[i]);
		}
		
		for(int i=0;i<list.size()-1;i++) {
			String data1 = list.get(i);
			String data2 = list.get(i+1);
			if(!data1.equals(data2)) {
				cnt++;
				list.remove(i+1);
				list.remove(i);
				i=-1;
			}
			
		}
		System.out.println(cnt*2);
	}
}