import java.util.Scanner;

public class Main{
        public  static void main(String[] args){
                calc();
        }
        static int calc(){
                Scanner sc = new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c,d;
                if((a+b)%2==0){
                        c=(a+b)/2;
                        if(c>0){
                                System.out.println(c);
                        return c;
                        }else{
                                d =c*(-1);
                                System.out.println(d);
                                return d;
                        }
                }else{
                        System.out.println("IMPOSSIBLE");
                }
                return 0;
        }
}