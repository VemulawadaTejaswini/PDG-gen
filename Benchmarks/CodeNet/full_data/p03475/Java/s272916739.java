import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C[] = new int[N];
        int S[] = new int[N];
        int F[] = new int[N];
        int ans=0;
        for(int i=0;i<N-1;i++){
            C[i]=sc.nextInt();
            S[i]=sc.nextInt();
            F[i]=sc.nextInt();
            }
        for(int i=0;i<N;i++){
            ans=0;
            for(int j=i;j<N-1;j++){
                if(j==i){
                    ans+=S[j]-ans+C[j];
                }else{
                    if(ans<=S[j]){
                        ans=S[j]+C[j];
                    }else{
                        ans+=(ans-S[j])%F[j]+C[j];
                    }
                }
            }
                        System.out.println(ans);
        }
    }
}