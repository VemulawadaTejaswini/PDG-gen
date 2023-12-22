import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println((int) Math.pow(100, reader.nextInt()) * reader.nextInt());
        reader.close();
    }
}