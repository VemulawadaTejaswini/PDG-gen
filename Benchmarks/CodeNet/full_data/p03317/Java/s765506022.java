import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner stdin = new Scanner(System.in)) {
            int numCount = stdin.nextInt();
            int length = stdin.nextInt();
            int pos = 0;
            int onePos = 0;
            while (true) {
                int num = stdin.nextInt();
                if (num == 1) {
                    onePos = pos;
                    break;
                }
                pos++;
            }
            int basePos = onePos - length + 1;
            int beforeNumCount = (basePos < 0) ? 0 : basePos;
            int beforeCount = (beforeNumCount == 0) ? 0 : ((beforeNumCount / (length - 1)) + ((beforeNumCount % (length - 1)) == 0 ? 0 : 1));

            int afterBasePos = basePos + length - 1;
            int afterNumCount = (afterBasePos + length >= numCount) ? 0 : (numCount - afterBasePos - 1);
            int afterCount = (afterNumCount == 0) ? 0 : ((afterNumCount / (length - 1)) + ((afterNumCount % (length - 1)) == 0 ? 0 : 1));

            System.out.println(Integer.toString(1 + beforeCount + afterCount));
        }
    }
}
