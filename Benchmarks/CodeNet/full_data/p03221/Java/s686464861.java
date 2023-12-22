import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M;
	static int[][] cityArr;
//	static int[][] setArr;
	static  List<Integer>[] cityList;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		cityArr = new int[M][2];
//		setArr = new int[N][M+1];
		cityList = new ArrayList[N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int xq =  Integer.valueOf(st.nextToken());
			int year =  Integer.valueOf(st.nextToken());
			cityArr[i][0] = xq;
			cityArr[i][1] = year;
			
//			setArr[xq-1][0]++;
//			
//			setArr[xq-1][setArr[xq-1][0]] = year;
			
			if(cityList[xq-1]==null) {
				cityList[xq-1] = new ArrayList<Integer>();
			}
			cityList[xq-1].add(year);
		}
		
		for(int i=0;i<N;i++) {
			List<Integer> listt = cityList[i];
			if(cityList[i]!=null) {
				Collections.sort(listt);
			}
		}
		
		//sort
//		for(int i=0;i<N;i++) {
//			int dataCount = setArr[i][0];
//			if(dataCount > 0) {//have data
//				int tempArr[] = setArr[i];
//				for(int j=1;j<=dataCount;j++) {
//					for(int k=1;k<=dataCount;k++) {
//						if(tempArr[k]>tempArr[j]) {
//							int temp = tempArr[j];
//							tempArr[j] = tempArr[k];
//							tempArr[k] = temp;
//						}
//					}
//				}
//			}
//		}
		
		for(int i=0;i<M;i++) {
			int qy = cityArr[i][0];
			int year = cityArr[i][1];
			
//			int arr[] = setArr[qy-1];
			List<Integer> listt = cityList[qy-1];
			int index = listt.indexOf(year);
			System.out.println(String.format("%06d", qy)+String.format("%06d", index+1));
//			for(int j=1;j<=arr[0];j++) {
//				if(arr[j]==year) {
//					System.out.println(String.format("%06d", qy)+String.format("%06d", j));
//					break;
//				}
//			}
		}
		
	}
	
}
