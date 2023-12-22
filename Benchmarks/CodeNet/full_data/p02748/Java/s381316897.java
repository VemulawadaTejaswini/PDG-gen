package marksProject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws Exception{
		  //      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  //      String tests = br.readLine();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[a];
		int[] brr = new int[b];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<b;j++) {
			brr[j]=sc.nextInt();
		}
		int[][] discountedprice = new int[a][b];
		
	
		for(int k=0;k<m;k++) {
			for(int l=0;l<3;l++) {
				discountedprice[sc.nextInt()-1][sc.nextInt()-1]=sc.nextInt();
			}
		}
		int mincost = Integer.MAX_VALUE;
		for(int x=0;x<a;x++) {
			for(int y=0;y<b;y++) {
				int cost = arr[x]+brr[y];
				int discount = discountedprice[x][y];
				if(cost-discount<mincost) {
					mincost = cost-discount;
				}
			}
		}	
		System.out.println(mincost);
		
		
				
		                             
	 }

}
