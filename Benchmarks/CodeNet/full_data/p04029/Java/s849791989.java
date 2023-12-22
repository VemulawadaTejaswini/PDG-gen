import java.util.Scanner;

public class Main {
    static int result = 0;
     static int fibonanci(int n){
         result += n;
        if(n <= 1 ){
            return n;
        }
        return fibonanci(n-1);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        fibonanci(n);
        System.out.println(result);


    }
}
