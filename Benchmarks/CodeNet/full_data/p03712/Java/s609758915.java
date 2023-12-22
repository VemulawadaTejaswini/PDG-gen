
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        String[] str = new String[h+1];
        for(int i=0; i<h+1; i++) {
            str[i] = scan.nextLine();
        }

            for(int j=0; j<w+2; j++) {
                System.out.print("#");
            }
            System.out.println();

            for(int k=1; k<h+1; k++) {
                System.out.println("#" + str[k] + "#");
            }

            for(int j=0; j<w+2; j++) {
                System.out.print("#");
            }
        System.out.println();


    }

}
