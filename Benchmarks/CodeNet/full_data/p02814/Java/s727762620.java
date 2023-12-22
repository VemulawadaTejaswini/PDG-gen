
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author yoshizaki
 *
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        new Main().semiCommonMultipler(scanner);
    }
    
    private void semiCommonMultipler(Scanner scanner) {
        int len = scanner.nextInt();
        int max = scanner.nextInt();
        scanner.nextLine();
        String num = scanner.nextLine();
        String[] nums = num.split(" ");
        List<Integer> ansList = new ArrayList<Integer>();
        
        Stream<String> stream = Arrays.stream(nums);
        stream.map(n ->  Integer.valueOf(n)).distinct()
        .forEach(n ->ansList.addAll(getscm(n, max)));
        long count = ansList.stream().count() - ansList.stream().distinct().count();
        
        System.out.println(count);
    }
     private List<Integer> getscm(int num, int max) {
         List<Integer> ansList = new ArrayList<Integer>();
         double ans = 0;
         for (double i = 1 ; max > ans ; i++ ) {
             ans = num * (i + 0.5d);
             if (ans < max && ans % 1d == 0d) {
                 ansList.add( (int) ans);
             }
         }
        return ansList;
    }
}
