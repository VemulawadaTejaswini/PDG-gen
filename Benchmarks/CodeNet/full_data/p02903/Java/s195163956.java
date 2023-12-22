import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        if(a==0 && b==0){
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    System.out.print(0);
                }
                System.out.println("");
            }
        }
        
        int[] x = new int[w];
        for(int i=0; i<w; i++){
            x[i] = (i<a)? 1 : 0;
        }
        int[][] ans = new int[h][w];
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                ans[i][j] = x[(i+j)%w];
            }
        }
        
        boolean f = true;
        for(int j=0; j<w; j++){
            int[] cnt = new int[2];
            for(int i=0; i<h; i++){
                cnt[ans[i][j]]++;
            }
            if(Math.min(cnt[0], cnt[1])!=b){
                f = false;
            }
        }
        
        if(f){
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    System.out.print(ans[i][j]);
                }
                System.out.println("");
            }
        }else{
            System.out.println("No");
        }
    }
    
}