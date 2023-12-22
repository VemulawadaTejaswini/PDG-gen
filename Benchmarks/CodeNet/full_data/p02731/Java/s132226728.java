 import java.util.Scanner;
    public class Main{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            double a=in.nextDouble();
            double ans=a-2;
            if(a<=2){
                ans=0;
            }
            System.out.println(ans);
        }
    }