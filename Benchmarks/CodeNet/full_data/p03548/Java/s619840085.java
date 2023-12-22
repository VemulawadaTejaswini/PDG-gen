import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int people = 0;
        if (x >= z) x -= z;
        else {
            System.out.println(0);
            return;
        }
        while (true){
            if (x >= y) {
                x = x - y;
                people++;
            }                         
            else break;
            if (x >= z) x -= z;
            else {
                people--;
                break;
            }
        }
        System.out.println(people);
    }
}
