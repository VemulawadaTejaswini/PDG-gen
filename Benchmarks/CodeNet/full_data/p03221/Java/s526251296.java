import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M;
	static int[][] cityArr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		long startTime = new Date().getTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		cityArr = new int[M][4];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int xq =  Integer.valueOf(st.nextToken());
			int year =  Integer.valueOf(st.nextToken());
			cityArr[i][0] = xq;//区域
			cityArr[i][1] = year;//年
			cityArr[i][2] = i;//序号
			cityArr[i][3] = 0;//按照区域-年排序之后的序号
//			if(i>0) {
//				if(cityArr[i][0]<cityArr[i-1][0]) {
//					int temp1 = cityArr[i][0];
//					int temp2 = cityArr[i][1];
//					
//					cityArr[i][0] = cityArr[i-1][0];
//					cityArr[i][1] = cityArr[i-1][1];
//					
//					cityArr[i-1][0] = temp1;
//					cityArr[i-1][1] = temp2;
//				}else if(cityArr[i][0]==cityArr[i-1][0]){
//					if(cityArr[i][1]<cityArr[i-1][1]) {
//						int temp1 = cityArr[i][0];
//						int temp2 = cityArr[i][1];
//						
//						cityArr[i][0] = cityArr[i-1][0];
//						cityArr[i][1] = cityArr[i-1][1];
//						
//						cityArr[i-1][0] = temp1;
//						cityArr[i-1][1] = temp2;
//					}
//				}
//			}
		}
		//sort
		Arrays.sort(cityArr, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]>o2[0]) {
					return 1;
				}else{
					if(o1[1]>o2[1]) {
						return 1;
					}else{
						return -1;
					}
				}
			}
		});
		int startt = 1;
		for(int i=0;i<M;i++) {
			if(i>0 && cityArr[i][0] != cityArr[i-1][0]) {
				startt = 1;
			}
			cityArr[i][3]=startt++;
		}
		
		//sort
		Arrays.sort(cityArr, new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[2]>o2[2]) {
					return 1;
				}else{
					return -1;
				}
			}
		});

//		for(int i=0;i<M;i++) {
//			System.out.println(cityArr[i][0]+" - "+cityArr[i][1]+" - "+cityArr[i][2]+" - "+cityArr[i][3]);
//		}
		
		for(int i=0;i<M;i++) {
			System.out.format("%06d%06d\n", cityArr[i][0],cityArr[i][3]);
		}
		
		
//		long endTime = new Date().getTime();
//		System.out.println((endTime-startTime)/1000);
		
	}
	
}
