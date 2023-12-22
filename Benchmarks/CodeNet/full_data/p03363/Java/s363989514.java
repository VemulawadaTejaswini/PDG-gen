
import java.util.Scanner;

public class Main {
    public static int[] ints;
    public static boolean[][] done;
    public static long[][] memo;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        ints=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=Integer.parseInt(scanner.next());
        }
        done=new boolean[N][N];
        memo=new long[N][N];
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                memo[i][j]=re(i,j);
                done[i][j]=true;
            }
        }
        System.out.println(result());
    }
    public static long re(int i,int j){
        if(i==0) return ints[j];
        if(done[i][j]) return memo[i][j];
        return re(i-1,j-1)+ints[j];
    }
    public static int result(){
        int n=memo.length;
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(memo[i][j]==0) result++;
            }
        }
        return result;
    }
}
