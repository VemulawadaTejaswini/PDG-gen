import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [] pp = new int[m];
        int [] yy = new int[m];

        int[][] a = new int[n][m];
        int[] b = new int[n];
        for (int i=0;i<m;i++){
            int p = scan.nextInt();
            int y = scan.nextInt();
            yy[i] = y;
            pp[i] = p;
            int l = p-1;
            a[l][b[l]] = y;
            b[l] += 1;
        }

        for (int i=0;i<n;i++){
            Arrays.sort(a[i]);  
        }

        for (int j=0;j<m;j++){
            int p = pp[j];
            int y = yy[j];
            int[] s = a[p-1];
            int po = search(s,y,0,b[p-1]-1);
            po = b[p-1] + 1 - po;

            String g = po+"";
            String k = p+"";
            int a1 = 6;
            int a2 = 6;
            a1 -= k.length();
            a2 -= g.length();

            for (int mm = 0;mm<a1;mm++){
                System.out.print("0");
            }
            System.out.print(k);
            for (int mm = 0;mm<a2;mm++){
                System.out.print("0");
            }
            System.out.println(g);                         


        }




    }

    static int search(int [] a, int b, int start, int end){
        if (start == end){
            return start+1;
        }
        int mid = (int) (start+end+1)/2;

        if (a[mid] == b){
            return mid+1;
        }
        if (a[mid] < b){
            end = mid-1;
        }
        else{
            start = mid;
        }
        return search(a,b,start,end);
    }
}