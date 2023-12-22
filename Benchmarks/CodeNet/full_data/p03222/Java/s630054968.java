import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9) + 7;
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        long[][] map = new long[h+1][w];
        map[0][0] = 1;
        for(int i = 1; i <= h; i++){
            for(int j = 0; j < w; j++){
                if(j != 0){
                    map[i][j] += ((map[i-1][j-1] % mod) * (long)(Math.pow(2,(j-1)/2) % mod) % mod * (long)(Math.pow(2,(j-2)/2) % mod)) % mod * (long)(Math.pow(2,(w-j-1)/2) % mod) %mod * (long)(Math.pow(2,(w-j-2)/2) % mod) % mod;
                }
                map[i][j] += ((map[i-1][j] % mod) * (long)(Math.pow(2,j/2) % mod) % mod * (long)(Math.pow(2,(j-1)/2) % mod)) % mod * (long)(Math.pow(2,(w-j-1)/2) % mod) * (long)(Math.pow(2,(w-j-2)/2) % mod) % mod;
                if(j != w-1){
                    map[i][j] += ((map[i-1][j+1] % mod) * (long)(Math.pow(2,j/2)%mod) % mod * (long)(Math.pow(2,(j-1)/2) % mod)) % mod  * (long)(Math.pow(2,(w-j-2)/2) % mod) * (long)(Math.pow(2,(w-j-3)/2) % mod) % mod;
                }
            }
        }
        System.out.println(map[h][k-1] % mod);
    }
}
