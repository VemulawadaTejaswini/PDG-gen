import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] color = new String[2];
        int[] num = new int[2];
        Scanner scanner = new Scanner(System.in);
        color[0] = scanner.next();
        color[1] = scanner.next();
        num[0] = Integer.parseInt(scanner.next());
        num[1] = Integer.parseInt(scanner.next());
        if (scanner.next().equals(color[0])) {
            num[0] = num[0]-1;
        }else {
            num[1] = num[1]-1;
        }
        System.out.println(num[0]+" "+num[1]);
    }
}