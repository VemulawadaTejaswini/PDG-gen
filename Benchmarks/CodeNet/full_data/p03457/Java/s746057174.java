import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int posx = 0;
        int posy = 0;
        int totalTime = 0;

        boolean flag = false;

        for(int i=0; i<num; i++){
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int timeDiff = time - totalTime;
            boolean timeDiffIsOdd = numIsOdd(timeDiff);

            int xdiff = Math.abs(x - posx);
            int ydiff = Math.abs(y - posy);
            int totalDiff = xdiff + ydiff;

            boolean totalDiffIsOdd = numIsOdd(totalDiff);

            if (totalDiff > timeDiff){
                flag = false;
                break;
            } else {
                if((totalDiffIsOdd && timeDiffIsOdd) || (!totalDiffIsOdd && !timeDiffIsOdd)){
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            totalTime += time;
            posx = x;
            posy = y;
        }

        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean numIsOdd(int num){
        if (num % 2 == 0){
            return false;
        }else{
            return true;
        }
    }
}
