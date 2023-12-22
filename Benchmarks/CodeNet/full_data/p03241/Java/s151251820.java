import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=n; i<40000; i++) {
            if(m % i == 0) {
                System.out.println(m / i);
                return;
            }
        }
        System.out.println(1);
    }

}
