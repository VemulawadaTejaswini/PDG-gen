import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                if(i*j == n) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");

    }


}
