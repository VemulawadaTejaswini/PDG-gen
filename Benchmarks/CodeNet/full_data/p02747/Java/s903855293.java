import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String trim = line.replace("\n", "");
        String result = trim.replaceAll("hi", "");
        if (result.equals("")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}