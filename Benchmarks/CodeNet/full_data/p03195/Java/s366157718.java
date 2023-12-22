import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        String ans = "second";
        boolean flg=true;
        boolean flgsub=false;
        for(int i=0;i<p;i++){
            int x= scan.nextInt();
            if(flgsub){x-=1;}
            if(x==0){continue;}
            if(x%2==1){
                flgsub=true;
                if(flg){
                    ans="first";
                    flg=false;
                }else{
                    ans="second";
                    flg=true;
                }
            }else{flgsub=false;}
        }
        System.out.println(ans);
    }
}