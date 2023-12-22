import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        int[][] Block = new int[H][W];
        for(int i=0;i<N;i++){
            Block[a[i]-1][b[i]-1] = 1;
        }
        
        int[] J = new int[10];
        for(int i=0;i<=H-3;i++){
            for(int j=0;j<=W-3;j++){
                int sum = 0;
                for(int k=i;k<=i+2;k++){
                    for(int l=j;l<=j+2;l++){
                        sum += Block[k][l];    
                    }
                } 
                J[sum] += 1;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(J[i]);    
        }
        
    }
}
