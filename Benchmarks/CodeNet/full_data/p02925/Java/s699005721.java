import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	int cnt;
	int A[][];
	int[] Atoday;
	int[] Aidx;
	boolean flg = true;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		cnt=n*(n-1)/2;
		A = new int[n][n];
		Atoday = new int[n];
		Aidx =  new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				A[i][j]=sc.nextInt()-1;
			}
		}

		while(flg){
			flg=false;
			for(int i=0;i<n;i++){
				if(Atoday[i]<=ans&&Aidx[i]<n-1){	//iはまだ対戦カードがあり、今日の対戦カードで選ばれていない
					int j = A[i][Aidx[i]];
					if(Atoday[j]<=ans&&Aidx[j]<n-1&&A[j][Aidx[j]]==i){	//jはまだ対戦カードがあり、今日の対戦カードで選ばれていない
						Aidx[i] += 1;
						Aidx[j] += 1;
						Atoday[i] = ans+1;
						Atoday[j] = ans+1;
						flg=true;
						cnt--;
					}
				}
			}
			ans++;
		}

		if(cnt!=0)ans=0;

		// 出力
		System.out.println(ans-1);
	}

	public static void main(String[] args){
		new Main();
	}
}