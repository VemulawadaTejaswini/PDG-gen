import java.util.Scanner;

class Main{
	static int[][] yobo;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();		//sima
		int M=sc.nextInt();		//yobo

		yobo=new int[M][2];
		int[] range=new int[2];
		int hashi=1;

		for(int i=0; i<M; i++) {
			yobo[i][0]=sc.nextInt();
			yobo[i][1]=sc.nextInt();
		}

		//sort(yobo);
		quick_sort(yobo, 0, M-1);
		for(int i=0; i<M; i++) {
			if(i==0) {
				range[0]=yobo[0][0];
				range[1]=yobo[0][1];
			}
			else {
				if(Math.min(range[1],yobo[i][1])-Math.max(yobo[i][0], range[0])>=1) {
					range[0]=Math.max(yobo[i][0], range[0]);
					range[1]=Math.min(yobo[i][1], range[1]);
				}
				else {
					hashi++;
					range[0]=yobo[i][0];
					range[1]=yobo[i][1];
				}
			}
		}


		/*for(int i=0; i<M; i++) {
			System.out.println(yobo[i][0]+" "+yobo[i][1]);
		}*/
		System.out.println(hashi);
	}

	/*
	static int pivot(int[][] a,int i,int j){
		int k=i+1;
		while(k<=j && a[i]==a[k]) k++;
		if(k>j) return -1;
		if(a[i][0]>=a[k][0]) return i;
		return k;
	}


	static int partition(int[][] a,int i,int j,int x){
		int tmp1=0;
		int tmp2=0;
		int l=i,r=j;

		// 検索が交差するまで繰り返します
		while(l<=r){

			// 軸要素以上のデータを探します
			while(l<=j && a[l][0]<x)  l++;

			// 軸要素未満のデータを探します
			while(r>=i && a[r][0]>=x) r--;

			if(l>r) break;
			tmp1=a[l][1];
			tmp2=a[r][1];
			a[l][1]=tmp2;
			a[r][1]=tmp1;
			int t=a[l][0];
			a[l][0]=a[r][0];
			a[r][0]=t;
			l++; r--;
		}
		return l;
	}

	public static void quickSort(int[][] a,int i,int j){
		if(i==j) return;
		int p=pivot(a,i,j);
		if(p!=-1){
			int k=partition(a,i,j,a[p][0]);
			quickSort(a,i,k-1);
			quickSort(a,k,j);
		}
	}


	public static void sort(int[][] a){
		quickSort(a,0,a.length-1);
	}
	*/





	    // 配列dのleftからrightまでの間のデータ列をクイックソートする
	    static void quick_sort(int[][] d, int left, int right) {
	        if (left>=right) {
	            return;
	        }
	        int p = d[(left+right)/2][0];
	        int l = left, r = right, tmp,tmp1,tmp2;
	        while(l<=r) {
	            while(d[l][0] < p) { l++; }
	            while(d[r][0] > p) { r--; }
	            if (l<=r) {
	                tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
	                tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
	                l++; r--;
	            }
	        }
	        quick_sort(d, left, r);  // ピボットより左側をクイックソート
	        quick_sort(d, l, right); // ピボットより右側をクイックソート
	    }
	    // 配列内のデータ列を表示する
	    static void print_data(int[] d) {
	        for(int i = 0; i < d.length; i++) System.out.print(d[i] + " ");
	        //System.out.println();
	    }

}