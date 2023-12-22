//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);

		int n;

		int sowa = 0;

		int shukai_p_point;
		int min_p_point;

		n = scan.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		//最大座標の取得
		shukai_p_point = list.stream().max(Integer::compareTo).get();
		//最小座標の取得
		min_p_point = list.stream().min(Integer::compareTo).get();

		//中間地点
		int half_p_point;
		half_p_point = (shukai_p_point - min_p_point) / 2;

		//総和の計算
		for (int i = 0; i < list.size(); i++) {
			sowa += (list.get(i) - half_p_point) * (list.get(i) - half_p_point);
		}

		System.out.println(sowa);

	}

}