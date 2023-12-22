import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	int A[][];
	int[] Atoday;
	int[] Aidx;
	boolean flg = true;

	Main(){
		// 整数の入力
		n = sc.nextInt();
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
				if(Aidx[i]<n-1)Atoday[i]=0;
				else Atoday[i]=2;
			}

			for(int i=0;i<n;i++){
				if(Atoday[i]==0){	//iはまだ対戦カードがあり、今日の対戦カードで選ばれていない
					for(int j=0;j<n;j++){
						if(Atoday[j]==0){	//jはまだ対戦カードがあり、今日の対戦カードで選ばれていない、
							if(A[i][Aidx[i]]==j&&A[j][Aidx[j]]==i){	//対戦カードが一致
								Aidx[i] += 1;
								Aidx[j] += 1;
								Atoday[i] = 1;
								Atoday[j] = 1;
								flg=true;
                              	break;
							}
						}
					}
				}
			}
			ans++;
		}

		for(int check:Atoday){
			if(check!=2){
				ans = 0;
				break;
			}
		}

		// 出力
		System.out.println(ans-1);
	}

	public static void main(String[] args){
		new Main();
	}
}