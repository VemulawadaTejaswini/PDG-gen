import java.util.*;
public class Main {
	public static void main(String[] args){
	
	//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d=new int[N+1];
		for(int i=0;i<N;i++){
			d[i]=sc.nextInt();
		}
		d[N]=0;
		int a=N;		//適当に調整
		
		//いろいろ 
	
	//計算
		//いろいろ
		int r=0;
		int tmp=d[0];
		
		for(int i=0;i<N;i++){
			if(r<i){r=i;}
			while( (d[r+1] & tmp) == 0 && r< (N-1) ){
				r++;
				tmp^=d[r];
			}
			tmp^=d[i];
			a+=r-i;
			
		}
		
	//出力
		System.out.println(a);
	}
}