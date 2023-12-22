import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String[] arr = x.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s.charAt(0));
        }
    }
}