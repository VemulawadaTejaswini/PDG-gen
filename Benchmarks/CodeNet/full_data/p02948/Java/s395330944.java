import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,w,x,y,z;
	int ans;
	int num = 100000;
	Long[] work;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		m = sc.nextInt();

		work = new Long[n];

		for(int i=0;i<n;i++){
			work[i]=sc.nextLong()+sc.nextLong()*num;
		}

		Arrays.sort(work,Comparator.reverseOrder());
      
		for(int day=0;day<=m;day++){
			while(w<n&&day+work[w]%num>m){
				w++;
			}
			if(w>=n)break;
			ans += work[w]/num;
			w++;
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}