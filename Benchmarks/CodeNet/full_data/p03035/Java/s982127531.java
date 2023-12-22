import java.util.Scanner;

public class Main {
    //Ferris Wheel
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int cost = sc.nextInt();
        sln(age, cost);
    }

    public static void sln(int age, int cost) {
        if (age >= 13) System.out.println(cost);
        else if (age >= 6 && age <= 12) System.out.println(cost / 2);
        else if (age < 6) System.out.println(0);
    }
}