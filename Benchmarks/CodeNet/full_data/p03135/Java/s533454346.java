import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        float worldBTime = Integer.valueOf(inputs[0]);
        float x  = Integer.valueOf(inputs[1]);
        float output = worldBTime/x;
        System.out.println(output);
    }
}
