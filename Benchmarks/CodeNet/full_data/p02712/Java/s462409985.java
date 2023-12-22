import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        //int b = sc.nextInt();
        double temp = 0;
        for(double i=1; i <= a ; i++) {
            if( !(i%3 == 0 || i%5 == 0 || i%15 == 0)){
                temp = temp + i;
            }
        }
        System.out.println(ceil(temp));

    }
}