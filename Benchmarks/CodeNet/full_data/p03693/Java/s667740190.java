import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.parseInt(sc.nextLine().replace(" ", ""))%4==0?"YES":"NO");
    }
}
