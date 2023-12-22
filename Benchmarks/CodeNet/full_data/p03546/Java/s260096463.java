import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[][][] warshall=new long[10][10][10];
        int h=sc.nextInt();
        int w=sc.nextInt();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                warshall[0][i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    warshall[i][j][k]=Math.min(warshall[i-1][j][k],warshall[i-1][j][i]+warshall[i-1][i][k]);
                }
            }
        }
        long ans=0;
        int tmp;
        for(int i=0;i<h*w;i++){
            tmp=sc.nextInt();
            if(tmp>=0)ans+=warshall[9][tmp][1];
        }
        System.out.println(ans);
    }
}