import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weather = sc.next();

        switch(weather){
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