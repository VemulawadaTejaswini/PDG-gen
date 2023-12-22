

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] City=new int[M][2];
		int[] sort = new int [M];
		int [] tag = new int[N];
	
	
		Map<Integer, Integer> map2 = new HashMap<Integer,Integer>(); 
		
		for(int i=0;i<M;i++) {
			City[i][0]=sc.nextInt();
			int w = sc.nextInt();
			City[i][1]=w;
			sort[i]=w;
			map2.put(w, i);
		}
		Arrays.sort(sort);

		for(int i=0;i<M;i++) {
			int x =sort[i];
			int y = map2.get(x);
			
			int z = City[y][0];
			
			if(tag[z-1]!=0) {
						City[y][1]=tag[z-1];
						System.out.println(City[y][1]);
						tag[z-1]=tag[z-1]+1;
					}else {
						tag[z-1]=1;
						City[y][1]=tag[z-1];
						tag[z-1]=tag[z-1]+1;
					}	
					
	      }
		
		for(int i=0;i<M;i++) {
			String str1 = String.format("%06d", City[i][0]);
			String str2 = String.format("%06d", City[i][1]);
			System.out.println(str1+str2);
		}
	}

}
