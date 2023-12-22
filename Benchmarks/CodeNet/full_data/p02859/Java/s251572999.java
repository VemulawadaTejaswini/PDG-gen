import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int r = Integer.parseInt(input);
        
        System.out.println(r * r * Math.PI / Math.PI);
    }
}