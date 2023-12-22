    import java.util.*;
    public class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	long h = sc.nextLomg();
        long w = sc.nextLong();
        long s = h * w;
        if(s % 2 == 1){
          s += 1;
        }
        System.out.println(s);
      
      }
    }