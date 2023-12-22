import java.util.*;


public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 3 || number % 3 == 0) {
          System.out.println(number / 3);
        } else {
          System.out.println((number / 3) + 1);
        }
    }
}