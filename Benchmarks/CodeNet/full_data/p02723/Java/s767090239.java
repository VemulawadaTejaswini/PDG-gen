import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
      	if (str.endsWith("[a-z]{2}[a-z]{2}")){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}