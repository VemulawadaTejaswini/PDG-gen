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

		//sort(yobo);		//もしも要望がソートされてなかったら

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

	  /*
	   * パーティション分割
	   * a[i]～a[j]の間で、x を軸として分割します。
	   * x より小さい要素は前に、大きい要素はうしろに来ます。
	   * 大きい要素の開始番号を返します。

	  static int partition(int[][] a,int i,int j,int x){
	    int l=i,r=j;

	    // 検索が交差するまで繰り返します
	    while(l<=r){

	      // 軸要素以上のデータを探します
	      while(l<=j && a[l][0]<x)  l++;

	      // 軸要素未満のデータを探します
	      while(r>=i && a[r][0]>=x) r--;

	      if(l>r) break;
	      int tmp1=a[l][1];
	      int tmp2=a[r][1];
	      a[l][1]=tmp2;
	      a[r][1]=tmp1;
	      int t=a[l][0];
	      a[l][0]=a[r][0];
	      a[r][0]=t;
	      l++; r--;
	    }
	    return l;
	  }

	  /*
	   * クイックソート（再帰用）
	   * 配列aの、a[i]からa[j]を並べ替えます。

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
}