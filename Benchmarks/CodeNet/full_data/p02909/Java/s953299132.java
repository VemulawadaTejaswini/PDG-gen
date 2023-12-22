import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        sc.close();

        if(str.equals("Sunny")){
            System.out.println("Cloudy");
        }
        else if (str.equals("Cloudy")){
            System.out.println("Rainy");
        }
        else if (str.equals("Rainy")){
            System.out.println("Sunny");
        }
    }
}