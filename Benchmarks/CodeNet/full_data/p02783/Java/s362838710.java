
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int attack = scanner.nextInt();
        int result = hp / attack;
        scanner.close();
        System.out.println(result == 0 ? 1 : result);
    }
}