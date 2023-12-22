
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char c = scanner.nextLine().charAt(0);

        if(c == 'A'){
            System.out.println('T');
        }else if(c == 'T'){
            System.out.println('A');
        }else if(c == 'G'){
            System.out.println('C');
        }else if(c == 'C'){
            System.out.println('G');
        }

    }

}
