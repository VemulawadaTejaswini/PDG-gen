import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        long N = scan.nextLong();

        long A;
        long B;

        int ans=20;

        for(long i=1; i<=Math.sqrt(N); i++){
            int a=0; //Ａの桁数
            int b=0; //Ｂの桁数
            int tmp;
            if(N%i == 0){
                A = i;
                B = N/A;
            }else{
                continue;
            }
            while(A>0){
                A = A/10;
                a++;
            }
            while(B>0){
                B = B/10;
                b++;
            }
            tmp = Math.max(a,b);
            ans = Math.min(ans,tmp);
        }
        System.out.println(ans);
    }
}