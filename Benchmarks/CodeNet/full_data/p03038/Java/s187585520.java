import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int M = sc.nextInt();
     long[] A = new long[N];
     long C,element,ans;
     int index,y,B;
     ans = 0;
     for(int i = 0;i<N;i++){
      A[i] = sc.nextInt();
     }
     sort(A,0,N-1);
     for(int j = 0;j<M;j++){
       B = sc.nextInt();
       C = sc.nextInt();
       index = 0;
       while(A[index] < C && index<N-1){
         index++;
       }

       if(index>B){
         for(int i=0;i<index-B;i++){
           A[i]=A[B+i];
         }
         for(int i=index-B;i<index;i++){
           A[i] = C;
         }
       }else{
         for(int i = 0;i<index;i++){
           A[i] = C;
         }
       }
     }
     for(int i=0;i<N;i++){
       ans += A[i];
     }
     System.out.println(ans);
   }
   int pivot(int[] a,int i,int j){
    int k=i+1;
    while(k<=j && a[i]==a[k]) k++;
    if(k>j) return -1;
    if(a[i]>=a[k]) return i;
    return k;
  }

  /*
   * パーティション分割
   * a[i]～a[j]の間で、x を軸として分割します。
   * x より小さい要素は前に、大きい要素はうしろに来ます。
   * 大きい要素の開始番号を返します。
   */
  int partition(int[] a,int i,int j,int x){
    int l=i,r=j;

    // 検索が交差するまで繰り返します
    while(l<=r){

      // 軸要素以上のデータを探します
      while(l<=j && a[l]<x)  l++;

      // 軸要素未満のデータを探します
      while(r>=i && a[r]>=x) r--;

      if(l>r) break;
      int t=a[l];
      a[l]=a[r];
      a[r]=t;
      l++; r--;
    }
    return l;
  }

  /*
   * クイックソート（再帰用）
   * 配列aの、a[i]からa[j]を並べ替えます。
   */
  public void quickSort(int[] a,int i,int j){
    if(i==j) return;
    int p=pivot(a,i,j);
    if(p!=-1){
      int k=partition(a,i,j,a[p]);
      quickSort(a,i,k-1);
      quickSort(a,k,j);
    }
  }
  public void sort(int[] a){
    quickSort(a,0,a.length-1);
  }
}
