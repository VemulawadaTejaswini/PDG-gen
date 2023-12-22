import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N][D];

        for(int i=0;i<N;i++){
            for(int j=0;j<D;j++){
                X[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                Double len = 0D;
                for(int k=0;k<D;k++){
                    len += (Double) Math.pow(X[i][k] - X[j][k], 2);
                }
                int len2 = (int)Math.sqrt(len);
                len = Math.sqrt(len);
                if((double)len2 == len)count++;
            }
        }
        System.out.println(count);
    }
}