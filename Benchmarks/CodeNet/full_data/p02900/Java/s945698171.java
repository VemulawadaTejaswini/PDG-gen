import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	long a,b,c,d,e,f,k,l,m,n,x,y,z;
	long ans;
	long[] so;
	int sid = 1;

	Main(){
		// 整数の入力
		a = sc.nextLong();
		b = sc.nextLong();

		x = Math.max(a,b);
		y = Math.min(a,b);
		z = x%2==0?2:3;
		n = Math.min(y,x/z);

		so = new long[2000000];
		so[0]=1;

		for(long cnt=2;cnt<n;cnt++){
			if(a%cnt==0&&b%cnt==0){
				boolean flg = true;
				for(int ss=1;ss<sid;ss++){
					if(ko(cnt,so[ss])!=1){
						flg=false;
						break;
					}
				}
				if(flg){
					so[sid] = cnt;
					sid++;
				}
			}
		}

		// 出力
		System.out.print(sid);
	}

	public long ko(long x,long y){
		if(y==0)return x;
		return ko(y,x%y);
	}

	public static void main(String[] args){
		new Main();
	}
}