import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.valueOf(sc.nextLine());
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int max = -1;
        int sum = 0;
        for(String inputEntry: inputs) {
            int number = Integer.valueOf(inputEntry);
            sum =sum + number;
            if(number>max) {
                max = number;
            }
        }
        if((sum-max)>max) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
