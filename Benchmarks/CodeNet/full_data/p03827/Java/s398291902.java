import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N,re=0,re1,re2,ans=0,max;
        String S;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        re1 = S.indexOf("I",0);
        re2 = S.indexOf("D",0);
        if(re1<re2){
            re = re1;
            if(re1==-1)
                re = re2;
        }
        else if(re1>re2&&re2!=-1){
            re = re2;
            if(re2==-1)
                re = re1;
        }
        max = 0;
        while( re < N){
            if(re!=-1){
                if(re1==re)
                    ans = ans + 1;
                else if(re2 == re)
                    ans = ans - 1;
                
                if(max<ans)
                    max = ans;
            }
            re1 = S.indexOf("I",re1+1);
            re2 = S.indexOf("D",re2+1);
            if(re1<re2){
                re = re1;
                if(re1==-1)
                    re = re2;
            }
            else if(re2<re1){
                re = re2;
                if(re2==-1)
                    re = re1;
            }
            else
                re = -1;
            if(re==-1)
                break;
        }
        System.out.println(max);
    }
}