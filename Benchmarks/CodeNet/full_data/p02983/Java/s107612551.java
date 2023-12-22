import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = Integer.parseInt(sc.next());
        long R = Integer.parseInt(sc.next());
        
        if(L % 2019 == 0) {
            System.out.println(0);
        }else if(R - L >= 2019) {
            System.out.println(0);
        }else {
            long min = 2018;
            for(long i = L; i < R; i++) {
                for(long j = L+1; j <= R; j++) {
                    if((i%2019)*(j%2019) % 2019 == 0) {
                        min = 0;
                        break;
                    }else {
                        if(min > (i%2019)*(j%2019) % 2019) {
                            min = (i%2019)*(j%2019) % 2019;
                        }
                    }
                }
            }
            
            System.out.println(min);
        }
    }
}