import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sort(a, 0, 2);
        int cost = (a[1]- a[0]);
        cost += (a[2] - a[1]);
        System.out.println(cost);
    }
    
    private static void sort(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left+right)/2];
        int l=left, r=right;
        int tmp;
        while(l<=r){
            while(d[l]<p){l++;}
            while(d[r]>p){r--;}
            if(l<=r){
                tmp=d[l];
                d[l] = d[r];
                d[r] = tmp;
                l++; r--;
            }
        }
        sort(d, left, r);
        sort(d, l, right);
    }
}
