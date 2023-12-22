import java.util.*;
public class Main {
    public static void main(String[] args){

        long NUM=1000000007;
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int D=sc.nextInt();
        int[][] X=new int[N][D];
        for(int i=0;i<N;i++){
            for(int j=0;j<D;j++){
                X[i][j]=sc.nextInt();
            }
        }
        int result=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int r2=0;
                for(int k=0;k<D;k++){
                    r2+=(X[j][k]-X[i][k])*(X[j][k]-X[i][k]);
                }
                int r=(int)Math.sqrt(r2);
                if(r*r==r2){
                    result++;
                }
            }
        }
        System.out.println(result);


    }
}
