import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> listOfIntegers = new ArrayList<Integer>();
        int odd = 0;
        int even = 0;
        
        for(int i =0 ; i < n ; i++){
          Integer num = scanner.nextInt();
          listOfIntegers.add(num);
          if(num % 2 == 0 ) {
            even++;
          } else {
            odd++;
          }
        }
        if(n%3 ==0) {
          if(odd==2 * even) {
            System.out.println("Yes");
            return;
          };
        }
        
        if(odd==n) {
          System.out.println("Yes");
          return;
        } else {
          System.out.println("No");
          return;
        }
    }
}