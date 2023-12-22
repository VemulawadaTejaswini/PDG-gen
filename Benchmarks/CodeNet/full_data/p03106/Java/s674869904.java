import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;

            int max = a > b ? a : b;
            for (int i = 1; i <= max; i++) {
                if ((a%i == 0) && (b%i ==0))
                    count++;
                if (count == c){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
