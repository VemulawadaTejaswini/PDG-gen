
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		int[] num = new int[4];
		int[] ans = new int[4];
		num[0] = -1;
		num[1] = -1;
		num[2] = -1;
		num[3] = -1;
		double con = 0.0;
		double etc = Math.pow(10, -9);
		while(true){
			num[0]++;
			if(100*a*num[0]>f){
				break;
			}
			while(true){
				num[1]++;
				if(100*a*num[0] + 100*b*num[1] > f){
					break;
				}
				while(true){
					num[2]++;
					if(100*a*num[0] + 100*b*num[1] + c*num[2]> f){
						break;
					}
					while(true){
						num[3]++;
						if(100*a*num[0] + 100*b*num[1] + c*num[2] + d*num[3] > f){
							break;
						}

						if(c*num[2] + d*num[3] <= e*(a*num[0] + b*num[1])){
							double x = ((double)100*(c*num[2] + d*num[3])) / (double)(100*a*num[0] + 100*b*num[1] + c*num[2] + d*num[3]);
							if(x-con>etc){
								for(int i=0;i<4;i++){
									ans[i] = num[i];
								}
								con = x;
							}
						}
						else{
							break;
						}

					}
					num[3] = -1;
				}
				num[2] = -1;
			}
			num[1] = -1;
		}

		System.out.println((100*a*ans[0]+100*b*ans[1]+c*ans[2]+d*ans[3])+" "+(c*ans[2]+d*ans[3]));


	}
}
