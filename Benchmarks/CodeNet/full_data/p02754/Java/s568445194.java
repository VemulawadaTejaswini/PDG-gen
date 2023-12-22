import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long n,a,b;
        n=scan.nextLong();
        a=scan.nextLong();
        b=scan.nextLong();
        long a_tmp,b_tmp,tmp;
        a_tmp=0;
        b_tmp=0;
        tmp=0;
        while(tmp<n){
            for(int i = 0;i<a;i++){
                tmp+=1;
                if(tmp>n) break;
                else a_tmp+=1;
            }
            for(int i = 0;i<b;i++){
                tmp+=1;
                if(tmp>n) break;
                else b_tmp+=1;
            }
        }
        System.out.println(a_tmp);
    }
}