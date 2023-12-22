import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]a = new int[N];
			for(int i = 0;i<N;i++)a[i] = scan.nextInt();
			
			int[] co = new int[8];
			int goldcount = 0;
			
			for(int i = 0;i<N;i++) {
				if(1<=a[i]&&a[i]<=399)co[0]++;
				if(400<=a[i]&&a[i]<=799)co[1]++;
				if(800<=a[i]&&a[i]<=1199)co[2]++;
				if(1200<=a[i]&&a[i]<=1599)co[3]++;
				if(1600<=a[i]&&a[i]<=1999)co[4]++;
				if(2000<=a[i]&&a[i]<=2399)co[5]++;
				if(2400<=a[i]&&a[i]<=2799)co[6]++;
				if(2800<=a[i]&&a[i]<=3199)co[7]++;
				if(3200<=a[i])goldcount++;
			}
			
			
			
			int mincount = 0;
			int cocount = 0;
			
			for(int i =0;i<8;i++) {
				if(co[i]>0)mincount++;//最小の種類
				if(co[i]==0)cocount++;//空白の数
			}
			
			
			
			
			int maxcount = mincount;
			//System.out.println(goldcount);
			//System.out.println(cocount);
			
			if(mincount==0) {//全員gold
				mincount = 1;
				maxcount = goldcount;	
			}else {//そうではない
				if(cocount>=goldcount) {//空白より少ない
					maxcount = mincount+goldcount;
				}else{//空白の数より多い
					maxcount = 8;
				}
				
			}
			
			
			System.out.println(mincount);
			System.out.println(maxcount);
			
			
			
			
			
		}
	}
}
