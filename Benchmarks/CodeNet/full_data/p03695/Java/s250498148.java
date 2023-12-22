import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//コンテストの参加人数
		int N=sc.nextInt();
		//各参加者のレート数配列
		int[] a=new int[N];
		//色を数えるための配列
		int[] colorCount=new int[8];
		int freeColorCount=0;
		
		//合計色のカウント
		int sum=0;
		int max=0;
		int min=0;
		
		//各参加者のレート数と色のカウント
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			if(1<=a[i]&&a[i]<399) {
				//灰色
				colorCount[0]=1;
			}else if(400<=a[i]&&a[i]<=799) {
				//茶色
				colorCount[1]=1;
			}else if(800<=a[i]&&a[i]<=1199) {
				//緑色
				colorCount[2]=1;
			}else if(1200<=a[i]&&a[i]<=1599) {
				//水色
				colorCount[3]=1;
			}else if(1600<=a[i]&&a[i]<=1999) {
				//青色
				colorCount[4]=1;
			}else if(2000<=a[i]&&a[i]<=2399) {
				//黄色
				colorCount[5]=1;
			}else if(2400<=a[i]&&a[i]<=2799) {
				//橙色
				colorCount[6]=1;
			}else if(2800<=a[i]&&a[i]<=3199) {
				//赤色
				colorCount[7]=1;
			}else if(3200<=a[i]) {
				//色自由の人
				freeColorCount++;
			}
			
		}
		
		for(int colorCount1:colorCount) {
			sum+=colorCount1;
		}
	
		
		if(freeColorCount==0) {
			System.out.println(sum+" "+sum);
		}else {
			if(sum==0) {
				min=sum+1;
			}else {
				min=sum;
			}
			
				max=sum+freeColorCount;
			
					
			System.out.println(min+" "+max);
		
		}
		
	}

}