import java.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	static int N,M;
	static String[] List;
	static String[][] city;
	static String[] Answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		M = ss.nextInt();
		ss.nextLine();
		ArrayList<String[]> strArray = new ArrayList<String[]> ();
		List = new String[M];
		city = new String[M][3];
		for (int i = 0; i < M; i++) {
			List[i] = ss.nextLine();
			String[] row = List[i].split(" ");
			city[i][0] = row[0];
			city[i][1] = row[1];	
		}
		HashMap map = new HashMap();
		for (int i = 0; i < M; i++) {            
			map.put(city[i][1], i);        
			}
		Main ts = new Main();
		ts.makesort(city , 1);
		
		city[0][2]="1";
		for (int i = 1; i < M; i++) {
			int j;
			for ( j = i-1; j >= 0; j--) {
				if(city[i][0].compareTo(city[j][0])!=0)continue;
				if(city[i][0].compareTo(city[j][0])==0) {
					int cnt = Integer.parseInt(city[j][2]);
					cnt++;
					String f = Integer.toString(cnt);
					city[i][2]= f;
					break;
				}
			}
			if(j<0)city[i][2] = "1";
		}
		
		for (int i = 0; i < M; i++) {
			String x = ts.format(city[i][0]);
			city[i][0] = x;
			String y = ts.format(city[i][2]);
			city[i][2] = y;
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				String cc = map.get(city[j][1]).toString();
				int ii = Integer.parseInt(cc);
				if(ii==i) {
					System.out.print(city[j][0]+city[j][2]);
					System.out.println();
					break;
				}
			}
		}
		
	}
	
	private void makesort(String[][] s, int x) {
		for (int j = 0; j < s.length; j++) {
			for (int i = 0; i < s.length - 1; i++) {
				String[] ss;
				if (s[i][x].compareTo(s[i + 1][x]) > 0) {
					ss = s[i];
					s[i] = s[i + 1];
					s[i + 1] = ss;
				}
			}
		}
		
	}
	public String format(String a) {
		int len = a.length();
		int n = 6-len;
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(a);
			sb.insert(0, "0");
			a = sb.toString();
		}
		return a;	
	}
}
