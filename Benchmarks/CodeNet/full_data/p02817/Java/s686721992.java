import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(inp.replace(" ", ""));
        sc.close();
    }
}