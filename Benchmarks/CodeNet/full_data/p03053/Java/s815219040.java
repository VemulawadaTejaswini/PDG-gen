import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
    static int h = sc.nextInt();
    static int w = sc.nextInt();
    public static void main(String[] args) {
        char[][] a = new char[h][w];
        int ans = 0;
        String tmp;
        for(int i = 0; i < h; i++){
            tmp = sc.next();
            a[i] = tmp.toCharArray();
        }
        int[][] copy1 = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int l = 0; l < w; l++){
                if(a[i][l]=='#'){
                    copy1[i][l]=1;
                }else{
                    copy1[i][l]=2;
                }
            }
        }

        while(true){
            int[][] copy2 = new int[h][w];
            for(int i = 0; i < h; i++){
                for(int l = 0; l < w; l++){
                    if(copy1[i][l]==1){
                        copy2[i][l]=1;
                        if(i!=0)copy2[i-1][l]=1;
                        if(i!=h-1)copy2[i+1][l]=1;
                        if(l!=0)copy2[i][l-1]=1;
                        if(l!=w-1)copy2[i][l+1]=1;
                    }else{
                        if(copy2[i][l]==0){
                            copy2[i][l]=2;
                        }
                    }
                }
            }
            ans++;
            for(int i = 0; i < h; i++){
                for(int l = 0; l < w; l++){
                    copy1[i][l]=copy2[i][l];
                }
            }  
            if(check(copy2))break;

        }
        System.out.println(ans);

    }

    static boolean check(int[][] a){
        for(int i = 0; i < h; i++){
            for(int l = 0; l < w; l++){
                if(a[i][l]==2){
                    return false;
                }
            }
        }
        return true;
    }

}
