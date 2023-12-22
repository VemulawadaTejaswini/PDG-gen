import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nString = String.valueOf(n).split("");
        int sum = 0;
        for (int i = 0; i < nString.length; i++) {
            sum += Integer.parseInt(nString[i]);
        }
        
        if (n%sum == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
