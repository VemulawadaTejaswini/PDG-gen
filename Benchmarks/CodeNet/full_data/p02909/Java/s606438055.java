import java.util.Scanner;

class Weather{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();

        switch(a){
            case "Sunny":
                System.out.println("Cloudy");
                break;
            case "Cloudy":
                System.out.println("Rainy");
                break;
            case "Rainy":
                System.out.println("Sunny");
                break;
            
        }
    
        
    }

    
}