import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        int[][] mat = new int[N][N];
        for(int i=0;i<N;++i){
            String s = scan.next();
            for(int j=0;j<N;++j)mat[i][j]=s.charAt(j)-'a';
        }
        int ans = 0;
        for(int b=0;b<N;++b){
            boolean ok = true;
            for(int i=0;i<N;++i){
                for(int j=i+1;j<N;++j){
                    if(mat[i][(j-b+N)%N] != mat[j][(i-b+N)%N]){
                        ok=false;
                        break;
                    }
                }
                if(!ok)break;
            }
            if(ok)ans+=N;
        }
        System.out.println(ans);
        
    }
}