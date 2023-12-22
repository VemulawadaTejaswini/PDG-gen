import java.util.*;

import javafx.collections.transformation.SortedList;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        long sumchk=0;
        long[][] beauty=new long[n][n];
        long[] bsort=new long[k];
        int sn=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if (j=0){
                    beauty[i][j]=array[i];
                    bsort[sn]=beauty[i][j];
                    sn++;
                }else{
                    beauty[i][j]=beauty[i][j-1]+array[i+j];
                    bsort[sn]=beauty[i][j];
                    sn++;
                }
            }
        }
        
        long[] bchk=new long [41];
        long[] bmax=new long [k];
        long bsmax=0;
        int bit=40;
        SortedList(bsort);
        long ans=bsort[k-1];
        for (int i=0;i<k;i++){
            ans&=bsort[k-1-i];
        }
        System.out.println(ans);
    }
}