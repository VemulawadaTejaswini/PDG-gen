import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数型を宣言して読み込む
		int N = sc.nextInt();
		int M = sc.nextInt();		
		//整数型配列の宣言と初期化	
		int ans=0;
		int [] ansarray;
		ansarray = new int [N];
		int [] arrays;
		arrays = new int [2*M];
		for(int i=0; i<2*M;i++){		
		arrays[i]=sc.nextInt();		
		}
		
		for(int j=0; j<N;j++){		
			for(int i=0; i<2*M;i+=2){			
				if(arrays[i]<=j&&j<=arrays[i+1]){	
				}else{		
				ansarray[j]=2;	
					}
				break;
			}
		}		
		for(int k=0; k<N;k++){
			if(ansarray[k]==2){
			ans = ans+1;
			}	
		}
		ans= N-ans;
		System.out.println(ans);
	}
}
