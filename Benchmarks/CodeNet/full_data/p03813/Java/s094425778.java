import java.util.Scanner;

public class kougi {
    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();

        if(1 <= x && x < 1200){
            System.out.println("ABC");
        }else if(1200 < x && x <= 3000){
            System.out.println("ARC");
        }


    }
}
