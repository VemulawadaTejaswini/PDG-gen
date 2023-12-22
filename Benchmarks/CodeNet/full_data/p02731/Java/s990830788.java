import java.util.*;
class Main
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            
            double l = sc.nextInt();
            double sum = 0;
            
            for(double x=0.1 ; x<l ; x+=0.1){
                for(double y=0.1 ; y<l-x ; y+=0.1){
                    double z = l-(x+y);
                    double menseki = x*y*z;
                    if(menseki>sum){
                        sum=menseki;
                    }
                }
            }
            System.out.println(sum);
        }
}

                    