import java.util.*;
/**
 *
 * @author kouki
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sichigosan = sc.nextInt();
        int sichigoCounter=0;
        for (int i = 1; i < sichigosan; i++) {
            //System.out.println(i);
            String sichigo = String.valueOf(i);
            if (!(sichigo.contains("0"))&&!(sichigo.contains("1"))&&!(sichigo.contains("2"))&&sichigo.contains("3")
                    &&!(sichigo.contains("4"))&&sichigo.contains("5")&&!(sichigo.contains("6"))&&sichigo.contains("7")
                    &&!(sichigo.contains("8"))&&!(sichigo.contains("9"))) {
                sichigoCounter++;
                //System.out.println(i);
            }
        }
        System.out.println(sichigoCounter);
    }
    
}