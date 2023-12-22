import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for(int i=a; i<=b; i++) {
            String strA = Integer.toString(i);
            if(strA.substring(0,2).equals(strA.substring(3))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
