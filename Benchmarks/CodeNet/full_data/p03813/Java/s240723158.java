import java.util.Scanner;

public class kougi {
    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();

        if(x >= 1200){
            System.out.println("ABC");
        }else{
            System.out.println("ARC");
        }


    }
}
