import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long checkx;
        long x = 0;
        long checky;
        long y = 0;


        for(checkx = 1;checkx <= n/2;checkx++){
            checky = n/checkx;
            double checker = (double)n/checkx;
            if(x ==0 && y == 0){
                x = checkx;
                y = checky;
            }else if(checker == (int)checker && checkx + checky <  x +y){
                x = checkx;
                y = checky;
            }
        }

        System.out.println(x+y-2);
    }
}