import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] xl = new int[n][2];
        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            int l = sc.nextInt()-1;
            xl[i][0] = x-l;
            xl[i][1] = x+l;
        }
        Arrays.sort(xl, (a, b) -> Integer.compare(a[0], b[0]));

//        System.out.println(xl[0][1]);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int cnt = 0;

//        int[][] arr = new int[n][2];
//        for (int i=0; i<n; i++){
//            arr[i][0] = xl[i][1]-xl[i][0];
//            arr[i][1] = xl[i][1]+xl[i][0];
//        }

        min = Math.min(min, xl[0][0]);
        max = Math.max(max, xl[0][1]);
//        System.out.println(min);
//        System.out.println(max);

        cnt++;

        for (int i=1; i<n; i++){
            int l = xl[i][0];
            int r = xl[i][1];
//            System.out.println(l);
//            System.out.println(r);
            if (max<l || r<min){
                cnt++;
                min = xl[i][0];
                max = xl[i][1];
            }
        }
        System.out.println(cnt);
    }
}
