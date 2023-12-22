import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long target = scanner.nextInt();
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
    public static  long calc(long target){
        long divNum = 0;
        long ansNum = 0;
        long sumNum = 0;
        for (long i= 1; target / 2 < i ; i++)
        {
            if (target % i == 0)
            {
                divNum = i ;
                ansNum = target / i;
            }
            if ( divNum + ansNum < sumNum || sumNum == 0  )
            sumNum = divNum + ansNum ;
        }
        return sumNum -2;
    }
}