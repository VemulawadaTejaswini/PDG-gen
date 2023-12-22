import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt();
        Integer b = scan.nextInt();
        Integer x = scan.nextInt();

        if((x >= a) && (b >= x-a))
            System.out.println("YES");
        else
        System.out.println("NO");
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}