import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        if(str.equals("Sunny")){
            System.out.println("Cloudy");
        }
        else if(str.equals("Cloudy")){
            System.out.println("Rainy");
        }
        else{
            System.out.println("Sunny");
        }
    }
}
