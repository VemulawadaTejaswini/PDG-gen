import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monsterHealth = input.nextInt();
        int attacks= input.nextInt();
        int neededAttack =(int) Math.ceil((double)monsterHealth/attacks);
        System.out.println(neededAttack);
    }
}