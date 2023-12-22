import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Data {
	public int p, y, index;
	public String num;

	public Data(int p0, int y0, int index0){
		p = p0;
		y = y0;
		index = index0;
	}
}

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] count = new int[n+1];
		ArrayList<Data> data = new ArrayList<>(m);
		
		for(int i = 0;i < m;i++){
			int p = sc.nextInt();
			int y = sc.nextInt();
			
			data.add(new Data(p, y, i));
		}
		data.sort((a,b)-> a.y-b.y);
		
		for(int i = 0;i < m;i++){
			Data nowData = data.get(i);
			int p = nowData.p;
			
			count[p]++;
			
			nowData.num = String.format("%06d", p) + String.format("%06d", count[p]);
		}
		data.sort((a,b)-> a.index-b.index);
		
		PrintWriter out = new PrintWriter(System.out);
		
		for(int i = 0;i < m;i++){
			out.println(data.get(i).num);
		}
		out.flush();
		
		
		sc.close();
	}
}
