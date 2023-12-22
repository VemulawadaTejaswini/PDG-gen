import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,a,b;
        n=scan.nextInt();
        a=scan.nextInt();
        b=scan.nextInt();
        int a_tmp,b_tmp,tmp;
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