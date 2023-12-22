import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tmp = 0;
        int count = 0;
        for(int i=a; i<=b; i++) {
            tmp = i;
            String num = new String();
            while(tmp > 0) {
                num += Integer.toString(tmp%10);
                tmp /= 10;
            }
            if(num.charAt(0) == num.charAt(4)) {
                if(num.charAt(1) == num.charAt(3)) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
