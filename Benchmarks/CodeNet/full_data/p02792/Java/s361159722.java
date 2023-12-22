import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[][] a = new int[10][10];

        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                a[i][j] = 0;
            }
        }

        for(int i=1; i<=N; i++){
            String s = String.valueOf(i);
            int l = s.length();
            int x = Integer.parseInt(String.valueOf(s.charAt(0)));
            int y = Integer.parseInt(String.valueOf(s.charAt(l - 1)));
            a[x][y]++;
        }

        long ans = 0;
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                ans += a[i][j] * a[j][i];
            }
        }
        System.out.println(ans);
    }
}