import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = 1;

        for(int i=n; i<40000; i++) {
            if(m % i == 0) {
                max = Math.max(max, m / i);
                break;
            }
        }

        for(int i=n-1; i>1; i--) {
            if(m % i == 0) {
                if(m / i >= n) {
                    max = Math.max(max, i);
                    break;
                }
            }
        }

        System.out.println(max);
    }

}
