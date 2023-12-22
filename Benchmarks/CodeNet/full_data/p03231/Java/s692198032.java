import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int M=sc.nextInt();
        String S=sc.next();
        String T=sc.next();
        long L=0;
        int G=0;
        for(int i=1;i<=N;i++){
            if(N%i==0 && M%i==0){
                L=N*M/i;
                G=i;
            }
        }
//        System.out.println(L+" "+G);
        boolean able =true;
        for(int i=0;i<N;i++){
            if(M*i%N==0){
                if(S.charAt(i)!=T.charAt(M*i/N)){
                    able=false;
                }
            }
//            System.out.println(able);
        }
        if(able){
            System.out.println(L);
        }else{
            System.out.println(-1);
        }
    }
}