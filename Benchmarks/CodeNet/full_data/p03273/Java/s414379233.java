import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int ans = 0;


        int h,w;

        h = sc.nextInt();
        w = sc.nextInt();
        int[][] a = new int[h][w];
        int[] nul_h = new int[h];
        int[] nul_w = new int[w];

        String[] s = new String[h];
        sc.nextLine();

        for(int i = 0;i < h;i++){
            s[i] = sc.nextLine();
        }


        for(int i = 0;i < h;i ++){
            for(int j = 0;j < w;j ++){
                a[i][j] = s[i].charAt(j) == '.'?0:1;
            }
        }

        int sum=0;
//
        for(int i = 0;i < h;i ++){
            for(int j = 0;j < w;j ++){
                sum+=a[i][j];
            }
            if(sum == 0) nul_h[i] = 1;
            sum = 0;
        }

        for(int i = 0;i < w;i ++){
            for(int j = 0;j < h;j ++){
                sum += a[j][i];
            }
            if(sum == 0) nul_w[i] = 1;
            sum = 0;
        }

        for(int i = 0;i < h;i ++){
            if(nul_h[i] != 1) {
                for (int j = 0; j < w; j++){
                    if (nul_w[j] != 1) System.out.print(a[i][j]==0?".":"#");
                }
                System.out.println("");
            }
//            System.out.println(s[i]);
        }


//        int[] a = new int[n];
//        for(int i = 0;i < n;i++){
//            a[i] = sc.nextInt();
//        }
//

    }
}