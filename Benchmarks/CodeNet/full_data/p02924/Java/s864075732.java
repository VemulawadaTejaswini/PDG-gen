import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println(sum(t));
    }

    public static int sum(int number){
        int result = 0;
        for(int i = number - 1; i >=0; i--){
            result += i;
        }
        return result;
    }