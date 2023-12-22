import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long tmp = h;
        long count = 0;
        
        while(tmp > 1){
            tmp /= 2;
            count++;
        }
        
        tmp = 0;
        for(long i=0; i<count; i++){
            tmp += (long)Math.pow(2, i);
        }
        
        System.out.println(tmp+h);
    }
}