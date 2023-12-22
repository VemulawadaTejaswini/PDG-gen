import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String coffee;
        Scanner scan = new Scanner(System.in);
        
        coffee = scan.nextLine();
        
        if(coffee.length() == 6) {
            if(coffee.charAt(2) == coffee.charAt(3) ||
               coffee.charAt(4) == coffee.charAt(5)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}