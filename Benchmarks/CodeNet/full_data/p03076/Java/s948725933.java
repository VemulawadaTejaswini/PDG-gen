import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rest = 11;
        int acc = 0;

        for(int i=0; i<5; i++){
            int tmp = scanner.nextInt();

            if(tmp % 10 < rest && tmp % 10 != 0){
                rest = tmp % 10;
            }

            acc += Math.ceil(tmp / 10.0) * 10;
        }

        if(rest != 11){
            acc -= 10;
            acc += rest;
        }
        System.out.println(acc);

    }
}
