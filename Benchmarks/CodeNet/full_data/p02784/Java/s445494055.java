import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer h = scan.nextInt();
        Integer n = scan.nextInt();
        Integer array[] = new Integer[n];

        int sum = 0;
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
            sum += array[i];
        }

        if(sum >= h)
            System.out.println("Yes");
        else
        System.out.println("No");

    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}