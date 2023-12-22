import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();

        int count1 = 0;
        for(int i = 0; i < size; i++) {
            if(str.charAt(i) == '.') count1++;
        }

        int count2 = 0;
        for(int i = 0; i < size; i++) {
            if(str.charAt(i) == '#') count2++;
        }

        int count = count1 > count2 ? count2 : count1;

        System.out.println(count);
    }
}