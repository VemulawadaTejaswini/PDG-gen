import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;++i)A[i]=scan.nextInt();
        if(A[0]!=0){
            System.out.println(-1);
        }else{
            int top=0;
            long ans = 0;
            for(int i=0;i<N;++i){
                if(A[i]!=top+1){
                    ans += (long)top;
                    top = A[i];
                }else top=A[i];
            }
            System.out.println(ans + A[N-1]);
        }
    }
}