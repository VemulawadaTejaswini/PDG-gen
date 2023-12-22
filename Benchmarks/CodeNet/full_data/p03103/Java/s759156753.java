import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        BigInteger M = new BigInteger(new Integer(sc.nextInt()).toString());

        int[] A = new int[N];
        int[] B = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        sc.close();

        sort(A, B);

        BigInteger count = new BigInteger("0");
        BigInteger value = new BigInteger("0");

        for(int i=0; i<N; i++){
            if(count.add(new BigInteger(new Integer(B[i]).toString())).compareTo(M) <= 0){
                count = count.add(new BigInteger(new Integer(B[i]).toString()));
                value = value.add(new BigInteger(new Integer(A[i]).toString()).multiply(new BigInteger(new Integer(B[i]).toString())));
                if(count.compareTo(M) >= 0){
                    break;
                }
            }else{
                value = value.add(new BigInteger(new Integer(A[i]).toString()).multiply(M.subtract(count)));
                break;
            }
        }

        System.out.println(value);

    }

    /*
     * 軸要素の選択
     * 順に見て、最初に見つかった異なる2つの要素のうち、
     * 大きいほうの番号を返します。
     * 全部同じ要素の場合は -1 を返します。
     */
    static int pivot(int[] a,int i,int j, int[] b){
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
    static int partition(int[] a,int i,int j,int x, int[] b){
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

            int tb=b[l];
            b[l]=b[r];
            b[r]=tb;

            l++; r--;
        }
        return l;
    }

    /*
     * クイックソート（再帰用）
     * 配列aの、a[i]からa[j]を並べ替えます。
     */
    public static void quickSort(int[] a,int i,int j, int[] b){
        if(i==j) return;
        int p=pivot(a,i,j, b);
        if(p!=-1){
            int k=partition(a,i,j,a[p], b);
            quickSort(a,i,k-1, b);
            quickSort(a,k,j, b);
        }
    }

    /*
     * ソート
     */
    public static void sort(int[] a, int[] b){
        quickSort(a,0,a.length-1, b);
    }

}
