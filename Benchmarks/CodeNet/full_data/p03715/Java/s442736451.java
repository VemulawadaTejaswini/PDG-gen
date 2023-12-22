
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();


        if(h % 3 == 0 || w % 3 ==0){
            System.out.print(0);
            return;
        }

        int result = 100000;
        for(int y = h / 3; y <= h/3+3 ; y++ ){
            for(int x = w / 2; x <= w / 2 +2 ; x++ ){
                int s1 = y*w;
                int s2 = (h-y)*x;
                int s3 = (h-y)*(w-x);
                List<Integer> list = Arrays.asList(s1,s2,s3);

                int max = Collections.max(list);
                int min = Collections.min(list);
                if( result > max - min){
                    result = max - min;
                }
            }
        }

        for(int y = h / 2; y <= h/2+2 ; y++ ){
            for(int x = w / 3; x <= w / 3 + 3 ; x++ ){
                int s1 = x*h;
                int s2 = (w-x)*y;
                int s3 = (w-x)*(h-y);
                List<Integer> list = Arrays.asList(s1,s2,s3);

                int max = Collections.max(list);
                int min = Collections.min(list);
                if( result > max - min){
                    result = max - min;
                }
            }
        }
    
        int s4 = Collections.min(Arrays.asList((w%3)*h , (h%3)*w ));
        if(result > s4){
            result = s4;
        }
        
        System.out.print(result);
    }
}