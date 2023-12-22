import java.util.Scanner;

class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        scanner.close();
        double per = l/3.0;
        double result = per*per*per;
        System.out.println(result);
    }
}