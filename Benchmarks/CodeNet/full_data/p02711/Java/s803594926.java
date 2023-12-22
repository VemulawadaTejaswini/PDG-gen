import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "No";
        if (input==7) output = "Yes";
        while (input/10 > 0){
            if (input%10 == 7) output = "Yes";
            input/= 10;

        }
        System.out.println(output);
    }
}
