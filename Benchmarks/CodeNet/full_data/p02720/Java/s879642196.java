import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int ans = 0;
		int keta = 2;
		double count = 1.0;
		if(K < 10){
			ans = K;
		}else{
			for(ans = 10;i < N;ans++){
				if(CheckNum(i,ans) != 1){
					while(CheckNum(ans,keta) != 1){
						i += (int)Math.pow(10.0,(double)keta - 1.0);
					}
				}
			}
		}
		System.out.println(ans);
	}
	public static int CheckNum(int num,int keta){
		int buf;buf2;
		while(keta > 1){
			buf = num / (int)Math.pow(10.0,(double)keta - 1.0);
			buf2 = (num - buf * (int)Math.pow(10.0,(double)keta - 1.0)) / (int)Math.pow(10.0,(double)keta - 2.0);
			if(Math.abs(buf - buf2) > 1){
				return keta;
			}else{
				keta--;
			}
		}
		return 1;
	}
}