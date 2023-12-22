import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double target = scanner.nextDouble();
    //    long start = System.currentTimeMillis(); 
        long ans = calc(target);
    //    long end = System.currentTimeMillis(); 
    //    long time = end - start;
        System.out.println(ans );
    //    System.out.println(time +"ms");
    }
    
    /**
     * @param target
     * @return
     */
    public static  long calc(double target){
        long targetNum = (long)target;
        long divNum = 0;
        divNum = (long) Math.sqrt(target);
        if (targetNum % divNum != 0 ) 
        {
            for (long i = divNum; i > 0; i--) 
            {
                if (targetNum % i == 0 ) 
                {
                    divNum = i;
                    break;
                }
            }
        }
        return (targetNum / divNum) + divNum -2;
    }
}