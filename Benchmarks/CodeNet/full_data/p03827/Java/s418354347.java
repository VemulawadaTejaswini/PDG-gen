import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N,re,ans=0;
        String S;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        re = S.indexOf("I",0);
        while(re<N){
            if(re!=-1){
                ans = ans + 1;
            }
            re = S.indexOf("I",re+1);
            if(re==-1)
                break;
        }
        re = S.indexOf("D",0);
        while(re<N){
            if(re!=-1){
                ans = ans - 1;
            }
            re = S.indexOf("D",re+1);
            if(re==-1)
                break;
        }
        System.out.println(ans);
    }
}