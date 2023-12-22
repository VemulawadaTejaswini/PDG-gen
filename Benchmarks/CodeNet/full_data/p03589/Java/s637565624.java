
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scn=new Scanner(System.in);
                int N=scn.nextInt();
                if(N<=4){
                        if(N==4){
                                System.out.println("3 3 3");
                        }else if(N==3){
                                System.out.println("1 6 6");
                        }else{
                                System.out.println("1 2 2");
                        }
                        return;
                }
                int h=N/4;
                int mod=N%4;
                if(mod==0){
                        h*=3;
                        System.out.println(h+" "+h+" "+h);
                        return;
                }else if(mod==1){
                        System.out.println(h+" "+h*2+" "+h*2);
                        return;
                }else{
                        int n=N/mod;
                        int w=N%mod;
                        System.out.println(h+" "+n+" "+w);
                }
        }
}