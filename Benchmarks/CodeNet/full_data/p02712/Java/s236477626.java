import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        long N = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= N; i++) {
            if(i%15 != 0 && i%3 != 0 && i%5 !=0){
              sum += i;
            }
        }
        System.out.println(sum);
      }
}