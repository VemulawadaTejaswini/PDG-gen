import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] map = new boolean[h+1000][w+1000];
        for(int i=0; i<h; i++){
            String s = sc.next();
            for(int j=0; j<w; j++){
                if(s.charAt(j) == '#'){
                    map[i+350][j+350] = true;
                }
            }
        }
        sc.close();

        int[][] sum = new int[h+1000][w+1000];
        for(int i=-5; i<h+w+5; i++){
            int mi = 350 - w + i;
            int mj = 350;
            for(int j=-5; j<w+5; j++){
                int mi1 = mi + j;
                int mj1 = mj + j;
                sum[mi1][mj1] = sum[mi1-1][mj1-1];
                if(map[mi1][mj1]){
                    sum[mi1][mj1]++;
                }
            }
        }

        long ans = 0;
        for(int i=-5; i<h+w+5; i++){
            int mi = 350 - w + i;
            int mj = 350;
            for(int j=-5; j<w+5; j++){
                int mi1 = mi+j;
                int mj1 = mj+j;
                if(map[mi1][mj1]){
                    for(int k=j+1; k<w+5; k++){
                        int mi2 = mi + k;
                        int mj2 = mj + k;
                        if(map[mi2][mj2]){
                            int d = k-j;
                            // ans += sum[mi2+d][mj2-d] - sum[mi1+d-1][mj1-d-1];
                            // ans += sum[mi2-d][mj2+d] - sum[mi1-d-1][mj1+d-1];
                            for(int l=0; l<d+1; l++){
                                int mi3 = mi1 + d + l;
                                int mj3 = mj1 - d + l;
                                if(map[mi3][mj3]){
                                    ans++;
                                }
                                mi3 = mi1 - d + l;
                                mj3 = mj1 + d + l;
                                if(map[mi3][mj3]){
                                    ans++;
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int i=0; i<sum.length; i++){
            Arrays.fill(sum[i], 0);
        }

        for(int i=-5; i<h+w+5; i++){
            int mi = 350 - w + i;
            int mj = 350 + w;
            for(int j=-5; j<w+5; j++){
                int mi1 = mi + j;
                int mj1 = mj - j;
                sum[mi1][mj1] = sum[mi1-1][mj1+1];
                if(map[mi1][mj1]){
                    sum[mi1][mj1]++;
                }
            }
        }

        for(int i=-5; i<h+w+5; i++){
            int mi = 350 - w + i;
            int mj = 350 + w;
            for(int j=-5; j<w+5; j++){
                int mi1 = mi+j;
                int mj1 = mj-j;
                if(map[mi1][mj1]){
                    for(int k=j+1; k<w+5; k++){
                        int mi2 = mi + k;
                        int mj2 = mj - k;
                        if(map[mi2][mj2]){
                            int d = k-j;
                            // if(d <= 1) continue;
                            // ans += sum[mi2+d-1][mj2+d+1] - sum[mi1+d][mj1+d];
                            // ans += sum[mi2-d-1][mj2-d+1] - sum[mi1-d][mj1-d];
                            for(int l=0; l<d+1; l++){
                                int mi3 = mi1 + d + l;
                                int mj3 = mj1 + d - l;
                                if(map[mi3][mj3]){
                                    ans++;
                                    if(mi1 == mi2 || mi2 == mi3 ||mi1 ==    mi3 || mj1 == mj2 || mj2 == mj3 | mj3  == mj1){
                                        ans--;
                                    }
                                }
                                mi3 = mi1 - d + l;
                                mj3 = mj1 - d - l;
                                if(map[mi3][mj3]){
                                    ans++;
                                    if(mi1 == mi2 || mi2 == mi3 ||mi1 ==    mi3 || mj1 == mj2 || mj2 == mj3 | mj3  == mj1){
                                        ans--;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}