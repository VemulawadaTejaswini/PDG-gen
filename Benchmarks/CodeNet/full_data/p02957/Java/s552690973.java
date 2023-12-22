import java.util.Scanner;

public class Main{
        public  static void main(String[] args){
                calc();
        }
        static int calc(){
                Scanner sc = new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c;
                if((a+b)%2==0){
                        c=(a+b)/2;
                        return c;
                }else{
                        System.out.println("IMPOSSIBLE");
                }
                return 0;
        }
}