import java.util.Scanner;

/**
 * @author weimengiq@126.com
 * 2018年12月3日
5 3
-30 -10 10 20 50
40

5 3
-30 -10 0 10 20
20

5 2
-30 -10 0 10 20
10
都在左边
5 3
-99 -98 -97 -96 -95 
97
左边且有0
6 3
-99 -98 -97 -96 -95 0
96

都在右边
5 3
1 2 3 4 5
3
右边且有0
6 3
0 1 2 3 4 5
2


 */

public class Main {

	static boolean logger =false;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();//蜡烛的总数
		int K=sc.nextInt();//需要点亮的蜡烛数量
		int[] candles=new int[N];
		boolean zeroCandles=false;
		long minLen=Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			candles[i]=sc.nextInt();
			if(candles[i]==0) {
				zeroCandles=true;
			}
		}
		
		if(candles[N-1]<=0) {//都在0的左边，距离取决于最左边的数字
			minLen=Math.abs(candles[N-K]);//从最后一个向左边数K个
		}else if(candles[0] >=0) {//都在0的右边,距离取决于最右边的数字，从左边数第K个数字
			minLen=candles[K-1];//第K个数字的坐标是K-1
			if(logger) System.out.println("111 "+minLen);
		}else {//左右都有的情况
			for(int i=0;i<N;i++) {
				if(logger) System.out.println("从"+candles[i]+"开始计算,位置在 "+(i) );
				if(i+K-1>=N) {//要包含当前点
					if(logger) System.out.println("大于总数了，要退出了");
					break;
				}
				if(candles[i]<=0 && candles[i+K-1]>=0 ) {
					int r=i+K-1;
					int lc=0;
					int rc=0;
					if(logger) System.out.println(K+"个数是 "+candles[i] +" 到 "+candles[r]);
					lc=candles[r]-candles[i]+Math.abs(candles[i]);
					rc=candles[r]-candles[i]+Math.abs(candles[r]);
					int c=Math.min(rc, lc);
					if(candles[i+K-1]==0) {
						c=candles[r]-candles[i];
					}
					if(candles[i]==0) {
						c=candles[r];
					}
					
					//if(logger) System.out.println("");
					
					if(logger) System.out.println("左侧成绩："+lc);
					if(logger) System.out.println("右侧成绩："+rc);
					if(logger) System.out.println("左右中最小的是"+c);
					if(c<minLen) {
						minLen=c;
						if(logger) System.out.println("当前值小于历史最小值，更新历史值为 "+minLen);
					}
				}
			}
		}
		System.out.println(minLen);
		
		
		sc.close();
		

	}

}