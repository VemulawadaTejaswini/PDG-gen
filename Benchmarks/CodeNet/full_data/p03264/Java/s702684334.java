import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numOfEven = num / 2;
        int numOfOdd = num - numOfEven;
        System.out.println(numOfEven * numOfOdd);
    }
}