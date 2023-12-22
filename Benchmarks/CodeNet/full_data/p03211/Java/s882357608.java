import java.util.*;
/**
 *
 * @author kouki
 */
public class Aim{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int syujin=643;
        String numbers2 = String.valueOf(numbers);
        
        for (int i = 0; i < numbers2.length()-2; i++) {
            String runrun = "";
            runrun = numbers2.substring(i,i+3);
            //System.out.println(runrun);
            int runrun2 = Integer.parseInt(runrun);
            if (Math.abs(753-runrun2)<syujin) {
                syujin = Math.abs(753-runrun2);
            }
        }
        
        System.out.println(syujin);
    }
    
}