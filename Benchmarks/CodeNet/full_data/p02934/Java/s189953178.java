import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] paramsA = scanner.nextLine().split(" ");
        scanner.close();

        double denominator = 0;
        
        for (String a: paramsA) {
            denominator += (double)1 / (double)(Integer.parseInt(a));
        }

        System.out.println(String.valueOf(((double)1 / denominator)));
    }
}