import java.util.*;
public class Main{
    public static void main(String... args){
       Scanner scan = new Scanner(System.in);
       long x = scan.nextLong();
       long y = scan.nextLong();

       long res = 0;


       if(x > 0 && y < 0){
           y*=(-1);
           res++;
       }else if(y < 0 && x < 0){
           
           if(x<y){
               x*=(-1);
               y*=(-1);
           }else{
               x*=(-1);
               y*=(-1);
               res+=2;
           }
       }else if(x < 0 && y > 0){
           x*=(-1);
           res++;
       }else if(x > 0 && y > 0 && x > y){
           res+=2;
       }

       res += Math.max(x,y)-Math.min(x,y);
       System.out.println(res);
    }
}
