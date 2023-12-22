import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        char[][] map=new char[H][W];
        int[][] result=new int[H][W];

        for(int i=0;i<H;i++){
            map[i]=sc.next().toCharArray();
            for(int j=0;j<W;j++){
                if(map[i][j]=='#'){
                    result[i][j]=0;
                }
                else{
                    result[i][j]=9999;
                }
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(j!=0) {
                    if (result[i][j] > result[i][j - 1] + 1) {
                        result[i][j] = result[i][j - 1] + 1;
                    }
                }
                if(i!=0){
                    if(result[i][j]>result[i-1][j]+1){
                        result[i][j]=result[i-1][j]+1;
                    }
                }
            }
        }
        for(int i=H-1;i>=0;i--){
            for(int j=W-1;j>=0;j--){
                if(j!=W-1) {
                    if (result[i][j] > result[i][j + 1] + 1) {
                        result[i][j] = result[i][j + 1] + 1;
                    }
                }
                if(i!=H-1){
                    if(result[i][j]>result[i+1][j]+1){
                        result[i][j]=result[i+1][j]+1;
                    }
                }
            }
        }
        int result2=0;
        for(int i=0;i<H;i++) {
            for (int j = 1; j < W; j++) {
                if (result[i][j] > result2) {
                    result2=result[i][j];
                }
            }
        }

        System.out.println(result2);
    }
}
