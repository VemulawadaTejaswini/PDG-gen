import java.util.*;
class Oddness {
  public static void findOddness() {
   	Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int odd = 0;
    double oddness;
    for (int i=1; i<=number ; i++) {
      if(i%2 != 0 )
        odd += 1;
    }
    oddness = odd / number; 
    System.out.println(oddness);
  }
}